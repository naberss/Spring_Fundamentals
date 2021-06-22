package com.nabers.spring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

	@RequestMapping(method = RequestMethod.GET, path = "/sum/{a}/{b}")
	public int sum(@PathVariable int a, @PathVariable int b) {
		return (a + b);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/sub")
	public int sub(@RequestParam(name = "a", defaultValue = "0") int a,
			       @RequestParam(name = "b", defaultValue = "0") int b) {
		return (a - b);
	}

}
