package com.example.countriesjooq.service;

import com.example.countriesjooq.repository.CountriesRepository;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Countries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountriesService {
    @Autowired
    private CountriesRepository countryRepository;
    public List<Countries> getAllCountries() {
        List<Countries> list1=countryRepository.getCountries();
        return list1;
    }


    public Countries getCountriesByID(String ID) {
        Countries country = countryRepository.getByID(ID);
        return country;
    }

}
