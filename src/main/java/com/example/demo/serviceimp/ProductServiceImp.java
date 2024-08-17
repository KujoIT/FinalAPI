package com.example.demo.serviceimp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import org.springframework.data.domain.Pageable;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductServiceImp implements ProductService {
	@Autowired
	public ProductRepository productRepository;
	
	@Override
	public Product getById(int id) {
		return this.productRepository.findById(id).get();
	}
	
//	public List<Product> getProductsByCategory(int category_id, Pageable pageable){
//		return this.productRepository.findByCategoryId(category_id, pageable);
//	}

	public List<Product> getProductsByCategory(int category_id, Pageable page) {
		Page<Product> products =  this.productRepository.findByCategoryId(category_id, page);
		return products.stream().toList();
	}
	
}
