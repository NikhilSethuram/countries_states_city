package com.example.countriesjooq.service;

import com.example.countriesjooq.model.StatesModel;
import com.example.countriesjooq.repository.StateRepository;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.States;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public StatesModel getStatesByID(String ID) {
        States state = stateRepository.getByID(ID);
        StatesModel model= new StatesModel();
        BeanUtils.copyProperties(state,model);
        return model;
    }
}
