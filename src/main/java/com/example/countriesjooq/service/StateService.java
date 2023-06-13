package com.example.countriesjooq.service;

import com.example.countriesjooq.repository.StateRepository;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public States getStatesByID(String ID) {
        States state = stateRepository.getByID(ID);
        return state;
    }
}
