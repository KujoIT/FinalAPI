package com.example.demo.service;

import java.util.List;
import org.springframework.data.domain.Pageable;
import com.example.demo.entity.Product;

public interface ProductService {
	Product getById(int id);
	
	List<Product> getProductsByCategory(int category_id, Pageable pageable);
}
