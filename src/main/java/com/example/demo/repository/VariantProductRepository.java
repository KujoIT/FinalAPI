package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.VariantProduct;

@Repository
public interface VariantProductRepository extends JpaRepository<VariantProduct, Integer> {
	List<VariantProduct> findByProductId(int product_id); //ép kiểu cho nó thành list<VP> thay vì Optional<VariantProduct> (default nếu không có code này)
}
