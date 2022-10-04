package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChargerConfig {
    private final RestClient restClient;
    private final ChargerRepository chargerRepository;

    @Autowired
    public ChargerConfig (RestClient restClient,ChargerRepository chargerRepository){
        this.restClient = restClient;
        this.chargerRepository = chargerRepository;
    }
    @Bean
    CommandLineRunner commandLineRunner(RestClient restClient){
        
        return args -> {
            String url = "http://apis.data.go.kr/B552584/EvCharger/getChargerInfo?serviceKey=3cxl%2B%2BbgVeK8a73TWUWSbI1L8BkjmuZt%2Bpy460NP%2F1zFm12OaJmyTuctV8G6ISgiOfxw9Wg9uhjqvYfpkuSgOQ%3D%3D&numOfRows=20&pageNo=1&dataType=XML";
            restClient.getChargerInfo(url, "");
            if (restClient.chargerList != null){
                chargerRepository.saveAll(restClient.chargerList);
            }

        };
    }
    


}
