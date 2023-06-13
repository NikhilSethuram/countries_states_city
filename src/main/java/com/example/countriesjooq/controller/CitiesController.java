package com.example.countriesjooq.controller;

import com.example.countriesjooq.model.CitiesModel;
import com.example.countriesjooq.service.CitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CitiesController {
    @Autowired
    private CitiesService citiesservice;

    @RequestMapping("/getID")
    public CitiesModel getCitiesByID(@RequestParam String ID){
        return citiesservice.getCitiesByID(ID);
    }
}
