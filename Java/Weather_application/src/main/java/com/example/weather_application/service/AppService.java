package com.example.weather_application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppService {
    @Autowired
    private RestTemplate restTemplate;
    public String getWeather(String location){
        String apiKey = "728e1e00ddba62bb3d77fa3e0a4b45ef";
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=" + apiKey;
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response.getBody();
    }
}
