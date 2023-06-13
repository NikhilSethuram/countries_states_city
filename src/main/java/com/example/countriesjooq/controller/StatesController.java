package com.example.countriesjooq.controller;

import com.example.countriesjooq.model.StatesModel;
import com.example.countriesjooq.service.StateService;
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
    public StatesModel getStatesByID(@RequestParam String ID){
        return stateservice.getStatesByID(ID);
    }
}
