package com.proyect1.prueba.apis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyect1.prueba.domain.User;
import com.proyect1.prueba.service.AuthenticationService;

@RestController
@RequestMapping("/sistema")
public class AuthenticationController {
	private static final Logger logger=LoggerFactory.getLogger(AuthenticationController.class);
	@Autowired
	private AuthenticationService authenticationservice;
	
	@PostMapping("/Login")
	public User login(@RequestParam(required=false,name="usuario") String usuario, @RequestParam(required=false,name="contraseña") String contraseña){
		logger.info("login"+usuario+" "+contraseña);
		User user= authenticationservice.login(usuario, contraseña);
		logger.info("Login Succes"+user);
		return user;
		
	}
}
