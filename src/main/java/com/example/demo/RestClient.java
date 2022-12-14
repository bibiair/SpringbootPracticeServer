package com.example.demo;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class RestClient {
    private final RestTemplate restTemplate;
    public List<Charger> chargerList = new ArrayList<Charger>();
    
    @Autowired
    public RestClient(RestTemplateBuilder restTemplateBuilder) {
        restTemplateBuilder.setConnectTimeout(Duration.ofSeconds(10));
        restTemplateBuilder.setReadTimeout(Duration.ofSeconds(10));
        this.restTemplate = restTemplateBuilder.build();
        
    }

    public void getChargerInfo(URI uri, String plainCreds) throws ParseException, JsonMappingException, JsonProcessingException{
        String response_str = restTemplate.getForObject(uri, String.class);
        // HttpHeaders headers = new HttpHeaders();
        // // headers.setContentType(MediaType.APPLICATION_XML);
        // HttpEntity<String> request = new HttpEntity<String>(headers);
        // ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        
        // String response_str = response.getBody();
        System.out.println(response_str);
        if (response_str.contains("SERVICE ERROR")){
            // getChargerInfo(url,plainCreds);
            return;
        }
        else{
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(response_str); // API??? ?????? ????????? JSON??? ??????
            JSONArray jsonObject_items = (JSONArray) jsonObject.get("items"); // API??? ?????? ????????? JSON??? ??????
            JSONObject jsonObject_item = (JSONObject) jsonObject_items.get(0); // API??? ?????? ????????? JSON??? ??????
            HashMap<String, Object> result = new ObjectMapper().readValue(jsonObject_item.toJSONString(), new TypeReference<HashMap<String, Object>>(){});
            ArrayList<LinkedHashMap<String,Object>> charger_info = (ArrayList) result.get("item");
            for (int i=0;i<charger_info.size();i++){
                LinkedHashMap<String,Object> temp_map = (LinkedHashMap<String,Object>) charger_info.get(i);
                Charger charger = new Charger(
                (String)temp_map.get("statNm"),
                (String)temp_map.get("statId"),
                Integer.parseInt(temp_map.get("chgerId").toString()),
                Integer.parseInt(temp_map.get("chgerType").toString()),
                (String)temp_map.get("addr"),
                Float.parseFloat(temp_map.get("lat").toString()),
                Float.parseFloat(temp_map.get("lng").toString()),
                (String)temp_map.get("useTime"),
                (String)temp_map.get("busiId"),
                (String)temp_map.get("busiNm"),
                (String)temp_map.get("busiCall"),
                Integer.parseInt(temp_map.get("stat").toString()),
                (String) temp_map.get("statUpdDt"),
                (String)temp_map.get("powerType"),
                Integer.parseInt(temp_map.get("zcode").toString()),
                (String)temp_map.get("parkingFree"),
                (String)temp_map.get("note"));
                chargerList.add(charger);}
        }
    }
}
