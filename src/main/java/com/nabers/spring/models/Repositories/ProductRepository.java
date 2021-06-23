package com.nabers.spring.models.Repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nabers.spring.models.Entities.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

}
