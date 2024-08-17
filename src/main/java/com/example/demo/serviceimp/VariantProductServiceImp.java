package com.example.demo.serviceimp;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.DTO.VariantProductDTO;
import com.example.demo.entity.VariantProduct;
import com.example.demo.repository.VariantProductRepository;
import com.example.demo.service.VariantProductService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class VariantProductServiceImp implements VariantProductService{
	@Autowired
	public VariantProductRepository variantProductRepository;

	public List<VariantProductDTO> getByProductId(int product_id) {
        List<VariantProduct> variants = variantProductRepository.findByProductId(product_id);
        return variants.stream().map(variant -> {
            VariantProductDTO dto = new VariantProductDTO();
            dto.setId(variant.getId());
            dto.setColor(variant.getColor());
            dto.setSize(variant.getSize());
            dto.setModel(variant.getModel());
            dto.setPrice(variant.getPrice());
            dto.setProductId(variant.getProduct().getId());
            return dto;
        }).collect(Collectors.toList());
    }
	
}
