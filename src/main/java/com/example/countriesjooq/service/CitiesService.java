package com.example.countriesjooq.service;

import com.example.countriesjooq.repository.CitiesRepository;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitiesService {
    @Autowired
    private CitiesRepository citiesRepository;

    public Cities getCitiesByID(String ID) {
        Cities city = citiesRepository.getByID(ID);
        return city;
    }
}
