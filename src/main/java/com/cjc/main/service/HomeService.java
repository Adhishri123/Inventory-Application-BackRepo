package com.cjc.main.service;

import java.util.List;

import com.cjc.main.model.ProductDetails;

public interface HomeService {

	public ProductDetails saveProduct(ProductDetails pr);

	public List<ProductDetails> getAllProduct();

	public ProductDetails deleteProduct(int id);

}
