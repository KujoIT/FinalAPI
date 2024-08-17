package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/get/product")
public class ProductController {
	@Autowired
	public ProductService productService;
		
	@GetMapping(path = "/id={id}")
	public Product getById(@PathVariable (name = "id") int id) {
		return this.productService.getById(id);
	}
	
	@GetMapping(path = "")
	public List<Product> getProductsByCategory(@RequestParam(name = "category_id") int category_id,
	                                            @RequestParam(name = "page") int page,
	                                            @RequestParam(name = "size") int size) {
	    PageRequest pageRequest = PageRequest.of(page, size);
	    return this.productService.getProductsByCategory(category_id, pageRequest);
	}
}
