package com.example.weather_application.controller;

import com.example.weather_application.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AppController {
    @Autowired
    private AppService appService;
    @GetMapping(value = "/weather")

    public String getWeather(@RequestParam(value="location")String location){
        return appService.getWeather(location);
    }
}
