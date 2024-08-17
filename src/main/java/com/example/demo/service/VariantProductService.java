package com.example.demo.service;

import java.util.List;
import com.example.demo.DTO.VariantProductDTO;

public interface VariantProductService {
	List<VariantProductDTO> getByProductId(int product_id); 
}
