package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Charger;
import com.example.demo.ChargerService;

@RestController
@RequestMapping("api/getChargerInfo")
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
