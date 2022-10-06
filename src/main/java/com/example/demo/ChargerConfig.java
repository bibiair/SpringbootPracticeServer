package com.example.demo;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChargerConfig {
    private final ChargerRepository chargerRepository;

    @Autowired
    public ChargerConfig (RestClient restClient,ChargerRepository chargerRepository){
        this.chargerRepository = chargerRepository;
    }
    @Bean
    CommandLineRunner commandLineRunner(RestClient restClient){
        
        return args -> {
            
            String url = "http://apis.data.go.kr/B552584/EvCharger/getChargerInfo?serviceKey=tr0UUkVEWO67fK7dYWEiaIy9xH7UBkSpCos7Ahy8eR8w2D%2Fapho2AyxP9SdLfT%2Bhpskz2ffBzoh%2FiXwijPNP5Q%3D%3D&pageNo=1&numOfRows=20&dataType=XML";
            URI uri = new URI(url);
            restClient.getChargerInfo(uri, "");
            if (restClient.chargerList != null){
                chargerRepository.saveAll(restClient.chargerList);
            }

        };
    }
    


}
