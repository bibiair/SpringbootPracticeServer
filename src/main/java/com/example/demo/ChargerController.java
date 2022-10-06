package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChargerController {
    ChargerService chargerService;

    @Autowired
    ChargerController(ChargerService chargerService){
        this.chargerService = chargerService;
    }

    @GetMapping("/getChargerInfo")
    public List<Charger> gestCharger(){
        return chargerService.getChargers();
    }

    @PostMapping("/addCharger")
    public void addCharger(@RequestBody Charger charger){
        chargerService.addChargers(charger);
    }
}
