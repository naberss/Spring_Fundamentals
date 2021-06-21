package com.nabers.spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/methods")
public class FirstController {

	/*
	 * @RequestMapping(method = RequestMethod.GET, path = { "/ola", "/pera" })
	 * public String olaMundo() { return "Ola Spring Boot"; }
	 * 
	 * @RequestMapping(method = RequestMethod.POST, path = { "/ola", "/pera" })
	 * public String olaMundo2() { return "Ola Spring Boot"; }
	 */

	@RequestMapping(method = RequestMethod.GET)
	public String get() {
		return "requisição get";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String post() {
		return "requisição post";
	}

	@RequestMapping(method = RequestMethod.PATCH)
	public String patch() {
		return "requisição patch";
	}

	@RequestMapping(method = RequestMethod.PUT)
	public String put() {
		return "requisição put";
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public String delete() {
		return "requisição delete";
	}

}
