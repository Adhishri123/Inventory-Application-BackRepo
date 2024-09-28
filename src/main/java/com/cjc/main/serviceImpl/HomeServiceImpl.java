package com.cjc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.ProductDetails;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	private HomeRepository hr;
	@Override
	public ProductDetails saveProduct(ProductDetails pr) {
		ProductDetails prods = hr.save(pr);
		return prods;
	}
	@Override
	public List<ProductDetails> getAllProduct() {
		
		return hr.findAll();
	}
	@Override
	public ProductDetails deleteProduct(int id) {
		
		return hr.deleteById(id);
	}

}
