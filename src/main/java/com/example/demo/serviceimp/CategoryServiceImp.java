package com.example.demo.serviceimp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CategoryServiceImp implements CategoryService {
	@Autowired
    private CategoryRepository categoryRepository;
	
	@Override
    public List<Category> getCategories() {
        return this.categoryRepository.findAll();
    }

}
