package com.nabers.spring.models.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.nabers.spring.models.Entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
