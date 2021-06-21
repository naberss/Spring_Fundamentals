package com.nabers.spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nabers.spring.models.Client;

@RestController
@RequestMapping(path = "/remove")
public class TestClass_Controller {

	@RequestMapping(method = RequestMethod.OPTIONS, path = "/client")
	public Client CreateClient() {
		return new Client("Lucao", 23, 1.75);
	}

}
