package com.example.countriesjooq.controller;

import com.example.countriesjooq.service.StateService;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StatesController {

    @Autowired
    private StateService stateservice;

    @RequestMapping("/getID")
    public States getStatesByID(@RequestParam String ID){
        return stateservice.getStatesByID(ID);
    }
}
