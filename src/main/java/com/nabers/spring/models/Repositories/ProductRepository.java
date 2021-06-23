package com.nabers.spring.models.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.nabers.spring.models.Entities.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

	@Query(value = "select * from Product A where A.name like %:name%", nativeQuery = true)
	public Iterable<Product> findByName(@Param(value = "name") String name);

}

/*
 * @Query("SELECT u FROM User u WHERE u.status = ?1 and u.name = ?2") User
 * findUserByStatusAndName(Integer status, String name);
 */