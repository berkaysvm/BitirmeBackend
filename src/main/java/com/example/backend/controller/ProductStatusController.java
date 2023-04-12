package com.example.backend.controller;

import com.example.backend.business.ProductStatusService;
import com.example.backend.dto.ProductEntityDto;
import com.example.backend.dto.ProductStatusEntityDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
public class ProductStatusController {
    private ProductStatusService productStatusService;

    public ProductStatusController(ProductStatusService productStatusService) {
        this.productStatusService = productStatusService;
    }

    @PostMapping("/save")
    public ProductStatusEntityDto save(@RequestBody ProductStatusEntityDto productStatusEntityDto)
    {
        return productStatusService.save(productStatusEntityDto);
    }
    @GetMapping("/getid")
    public List<ProductStatusEntityDto> get()
    {
        return productStatusService.getAll();
    }
}
