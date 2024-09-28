package com.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.ProductDetails;

@Repository
public interface HomeRepository extends JpaRepository<ProductDetails, Integer>{

	public ProductDetails deleteById(int id);
	
}
