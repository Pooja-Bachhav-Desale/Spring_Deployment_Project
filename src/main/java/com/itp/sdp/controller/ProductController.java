package com.itp.sdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itp.sdp.dto.ProductDTO;
import com.itp.sdp.model.Product;
import com.itp.sdp.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/saveProduct")
	ResponseEntity<ProductDTO> saveProduct(@RequestBody ProductDTO product)
	{
		return  new ResponseEntity<ProductDTO>(productService.saveProduct(product),HttpStatus.CREATED);
	}
	
}
