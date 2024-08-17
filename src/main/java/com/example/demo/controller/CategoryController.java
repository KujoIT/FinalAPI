package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;

@RestController
@RequestMapping("/get/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;  
    
    @GetMapping
    public List<Category> getCategories() {
        return this.categoryService.getCategories();
    }
}
