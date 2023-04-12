package com.example.backend.controller;

import com.example.backend.business.ProductService;
import com.example.backend.dto.OrderEntityDto;
import com.example.backend.dto.ProductEntityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/save")
    public ProductEntityDto save(@RequestBody ProductEntityDto productEntityDto)
    {
        return productService.save(productEntityDto);
    }
    @GetMapping("/getid")
    public ProductEntityDto get(@RequestParam Long id)
    {
        return productService.get(id);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam Long id)
    {
        return productService.delete(id);
    }
}
