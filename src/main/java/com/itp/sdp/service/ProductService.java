package com.itp.sdp.service;

import org.jspecify.annotations.Nullable;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itp.sdp.dto.ProductDTO;
import com.itp.sdp.model.Product;
import com.itp.sdp.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired	ProductRepository productRepository;
	
	@Autowired
	ModelMapper modelMapper;
	

	public @Nullable ProductDTO saveProduct(ProductDTO productDto) {
		Product product=modelMapper.map(productDto, Product.class);
		Product productSavedInDB= productRepository.save(product);
		return modelMapper.map(productSavedInDB,ProductDTO.class);
	}
	
}
