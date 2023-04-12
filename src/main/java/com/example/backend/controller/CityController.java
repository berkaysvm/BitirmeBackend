package com.example.backend.controller;

import com.example.backend.business.CityService;
import com.example.backend.dto.CityDto;
import com.example.backend.ecxeption.NotFoundExc;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.xml.stream.events.EntityDeclaration;
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
    public List<CityDto> get(@RequestParam Integer id) throws EntityNotFoundException
    {
        try
        {
            return cityService.getCity(id);
        }
        catch (EntityNotFoundException exception)
        {
        throw new NotFoundExc("Aradığınız id ile bir Şehir bulunamadı");
        }
    }
    @DeleteMapping("/delete")
    public String delete(@RequestParam Integer id) throws Exception {
        return cityService.delete(id);
    }
}
