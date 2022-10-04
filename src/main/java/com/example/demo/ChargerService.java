package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChargerService {
    private final ChargerRepository chargerRepository;
    @Autowired
    public ChargerService(ChargerRepository chargerRepository){
		this.chargerRepository = chargerRepository;
    }

    public List<Charger> getChargers(){
        return chargerRepository.findAll();
    }
}
