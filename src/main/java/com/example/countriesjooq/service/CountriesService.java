package com.example.countriesjooq.service;

import com.example.countriesjooq.model.CountriesModel;
import com.example.countriesjooq.repository.CountriesRepository;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Countries;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountriesService {
    @Autowired
    private CountriesRepository countryRepository;
    public List<CountriesModel> getAllCountries() {
        List<CountriesModel> modellist= new ArrayList<>();
        List<Countries> list1=countryRepository.getCountries();
        for(Countries cnt: list1){
            CountriesModel model = new CountriesModel();
            BeanUtils.copyProperties(cnt,model);
            modellist.add(model);
        }
        return modellist;
    }


    public CountriesModel getCountriesByID(String ID) {
        Countries country = countryRepository.getByID(ID);
        CountriesModel model = new CountriesModel();
        BeanUtils.copyProperties(country,model);
        return model;
    }

}
