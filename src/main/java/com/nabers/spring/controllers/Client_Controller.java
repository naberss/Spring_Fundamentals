package com.nabers.spring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nabers.spring.models.Entities.Client;

@RestController
@RequestMapping(path = "/client")
public class Client_Controller {

	@RequestMapping(method = RequestMethod.OPTIONS, path = "/client")
	public Client createClient() {
		return new Client(1, "Lucao", 23, 1.75);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/create/{id}")
	public Client createClientById(@PathVariable int id) {
		return new Client(id, "new Client", 45, 1.70);
	}

	@RequestMapping(method = RequestMethod.GET)
	public Client createClientById1(@RequestParam(name = "id", defaultValue = "12") int id) {
		return new Client(id, "new Client", 45, 1.70);
	}

}
