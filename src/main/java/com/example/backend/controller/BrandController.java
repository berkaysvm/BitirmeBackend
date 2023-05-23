package com.example.backend.controller;

import com.example.backend.business.BrandService;
import com.example.backend.dto.BrandDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;

@RestController
@RequestMapping("/brand")
public class BrandController {
    private BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PostMapping("/save")
    public BrandDto save(@RequestBody BrandDto brandDto)
    {
     return brandService.save(brandDto);
    }

    @GetMapping("/getById")
    public BrandDto get(@RequestBody Integer id)
    {
        return brandService.get(id);
    }

}
