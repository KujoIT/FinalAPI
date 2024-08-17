package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.DTO.VariantProductDTO;
import com.example.demo.service.VariantProductService;

@RestController
@RequestMapping("/get/variantproduct")
public class VariantProductController {
	@Autowired
	public VariantProductService variantProductService;
	
	@GetMapping("/productid={id}")
	public List<VariantProductDTO> getByProductId(@PathVariable(name = "id") int product_id) {
		return this.variantProductService.getByProductId(product_id);
	}
}
