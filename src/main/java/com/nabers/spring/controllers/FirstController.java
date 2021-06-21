package com.nabers.spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@RequestMapping(method = RequestMethod.GET,path = {"/ola","/pera"})
	public String olaMundo() {
		return "Ola Spring Boot";
	}

}
