package com.example.backend.controller;

import com.example.backend.business.SizeService;
import com.example.backend.dto.SizeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Size")
public class SizeController {
    private SizeService sizeService;
    @Autowired
    public SizeController(SizeService sizeService) {
        this.sizeService = sizeService;
    }
    @PostMapping("/save/")
    public SizeDto save(@RequestBody SizeDto sizeDto)
    {
        return sizeService.save(sizeDto);
    }


}

