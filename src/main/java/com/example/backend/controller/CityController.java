package com.example.backend.controller;

import com.example.backend.business.CityService;
import com.example.backend.dto.CityDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;


@NoArgsConstructor
@RestController
@RequestMapping("/city")
public class CityController {
    private CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
    @PostMapping("/save/")
    public CityDto save(@RequestBody CityDto cityDto)
    {
        return cityService.save(cityDto);
    }

    @GetMapping("/get/")
    public List<CityDto> get(@RequestParam Integer id)
    {
        return cityService.getCity(id);
    }
    @DeleteMapping("/delete")
    public String delete(@RequestParam Integer id) throws Exception {
        return cityService.delete(id);
    }
}
