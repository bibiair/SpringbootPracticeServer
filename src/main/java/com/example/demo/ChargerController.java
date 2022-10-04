package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/getChargerInfo",
produces = "application/json;charset=UTF-8")
public class ChargerController {
    ChargerService chargerService;

    @Autowired
    ChargerController(ChargerService chargerService){
        this.chargerService = chargerService;
    }

    @GetMapping
    public List<Charger> gestCharger(){
        return chargerService.getChargers();
    }
}
