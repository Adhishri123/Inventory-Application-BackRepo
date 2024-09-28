package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.ProductDetails;
import com.cjc.main.service.HomeService;

@RestController
@CrossOrigin("http://localhost:4200")
public class HomeController {

	@Autowired
	private HomeService hs;
	
	@PostMapping("/save_product")
	public ResponseEntity<ProductDetails> addProduct(@RequestBody ProductDetails pr)
	{
		ProductDetails prodd = hs.saveProduct(pr);
//		response entity
		return new ResponseEntity<ProductDetails>(prodd, HttpStatus.CREATED);
	}
	
	@GetMapping("/get_product")
	public ResponseEntity<List<ProductDetails>> getProduct()
	{
		List<ProductDetails> pl = hs.getAllProduct();
		return new ResponseEntity<List<ProductDetails>>(pl, HttpStatus.OK);
	}
	
	@PutMapping("/edit_product/{productId}")
	public ResponseEntity<ProductDetails> updateProduct(@PathVariable ("productId") int id,@RequestBody ProductDetails pr)
	{
		ProductDetails produ = hs.saveProduct(pr);
		
		return new ResponseEntity<ProductDetails>(produ, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete_product/{productId}")
	public ProductDetails deleteProduct(@PathVariable ("productId") int id)
	{
		ProductDetails proddl = hs.deleteProduct(id);
		
		return proddl;
	}
}
