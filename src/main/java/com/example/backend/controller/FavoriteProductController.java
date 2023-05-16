package com.example.backend.controller;

import com.example.backend.business.CityService;
import com.example.backend.business.FavoriteProductService;
import com.example.backend.dto.CityDto;
import com.example.backend.dto.FavoriteProductEntityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favorite_product")
public class FavoriteProductController {
    private FavoriteProductService favoriteProductService;
    @Autowired
    public FavoriteProductController(FavoriteProductService favoriteProductService)
    {
        this.favoriteProductService = favoriteProductService;
    }
    @PostMapping("/save/")
    public FavoriteProductEntityDto save(@RequestBody FavoriteProductEntityDto favoriteProductEntityDto)
    {
        return favoriteProductService.save(favoriteProductEntityDto);
    }

    @GetMapping("/get/")
    public List<FavoriteProductEntityDto> get(@RequestParam Long id)
    {
        return favoriteProductService.getFavoriteProductList(id);
    }
    @DeleteMapping("/delete")
    public String delete(@RequestParam Long id){
        return favoriteProductService.delete(id);
    }
}
