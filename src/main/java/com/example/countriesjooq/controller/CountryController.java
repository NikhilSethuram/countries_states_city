package com.example.countriesjooq.controller;

import com.example.countriesjooq.model.CountriesModel;
import com.example.countriesjooq.service.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountriesService countryservice;

    @GetMapping
    public List<CountriesModel> getCoutries(){
        return countryservice.getAllCountries();
    }

    @RequestMapping("/getID")
    public CountriesModel getCountriesByID(@RequestParam String ID){
        return countryservice.getCountriesByID(ID);
    }

}
