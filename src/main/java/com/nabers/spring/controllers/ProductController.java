package com.nabers.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nabers.spring.models.Entities.Product;
import com.nabers.spring.models.Repositories.ProductRepository;

@RestController
@RequestMapping(path = "/api/product")
public class ProductController {

	 @Autowired 
	public ProductRepository productRepostory;

	@RequestMapping(method = RequestMethod.POST, path = "/insert")
	public Product myProduct(@RequestParam(name = "name") String name) {
		Product product = new Product(name);
		productRepostory.save(product);
		return product;
	}

}
