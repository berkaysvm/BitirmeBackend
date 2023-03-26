package com.example.backend.controller;

import com.example.backend.business.CategoryService;
import com.example.backend.dto.CategoryEntityDto;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.security.AuthProvider;
import java.security.PublicKey;

@Component
@RestController
@RequestMapping("/category")
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService)
    {
        this.categoryService=categoryService;
    }

    @PostMapping("/save/")
    public String save(@RequestBody CategoryEntityDto categoryEntityDto)
    {
        return categoryService.save(categoryEntityDto);
    }
    @GetMapping("/get/")
    public CategoryEntityDto get(@RequestParam Integer id)
    {
        return categoryService.get(id);
    }
}
