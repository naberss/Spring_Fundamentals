package com.nabers.spring.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nabers.spring.models.Entities.Product;
import com.nabers.spring.models.Repositories.ProductRepository;

@RestController
@RequestMapping(path = "/api/product")
public class ProductController {

	@Autowired
	private ProductRepository productRepostory;

	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT }, path = "/insert_update")
	public @ResponseBody Product myProduct(@Valid Product product) {

		productRepostory.save(product);
		return product;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/findall")
	public List<Product> findAll() {

		return (List<Product>) productRepostory.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/findbyid")
	public Optional<Product> findById(@RequestParam(name = "id") int id) {

		return productRepostory.findById(id);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/findbyname")
	public Iterable<Product> findByName(@RequestParam(name = "name") String name) {

		return productRepostory.findByName(name);
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "deletebyid")
	public void delete(int id) {
		productRepostory.deleteById(id);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/paginatedrequest")
	public Iterable<Product> paginatedRequest(@RequestParam(name = "pagnum") int pagnum,
			@RequestParam(name = "pagsize") int pagsize) {

		Pageable page = PageRequest.of(pagnum, pagsize);
		return productRepostory.findAll(page);

	}

}
