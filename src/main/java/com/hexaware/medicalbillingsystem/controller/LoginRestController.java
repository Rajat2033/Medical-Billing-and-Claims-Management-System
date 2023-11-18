package com.hexaware.medicalbillingsystem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hexaware.medicalbillingsystem.dto.AuthRequest;
import com.hexaware.medicalbillingsystem.service.AuthJWTService;

@RestController
@RequestMapping("/api/v1/login")
public class LoginRestController {
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	private AuthJWTService jwtService;
	
	Logger logger=LoggerFactory.getLogger(LoginRestController.class);

	public String hello() {
		return "Welcome to Login Page";
	}

	@PostMapping("/authenticate")
	public String authenticateAndGenerateToken(@RequestBody AuthRequest authReq) {
		
			Authentication authenticate = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authReq.getUsername(), authReq.getPassword()));

			// If authentication is successful, generate a JWT
			String Token=null;
			if (authenticate.isAuthenticated()) {
				Token=jwtService.generateToken(authReq.getUsername());
				logger.info("JWT Token successfully generated!!!");
			}

			else {
				logger.info("Not Found USERNAME!!!!");
				throw new UsernameNotFoundException("UserName Not Found!!!! ");
			}
		 return Token;
		
	}
}
