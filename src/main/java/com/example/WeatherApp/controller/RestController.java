package com.example.WeatherApp.controller;

import com.example.WeatherApp.ApiProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@org.springframework.web.bind.annotation.RestController

@EnableConfigurationProperties(ApiProperties.class)
public class RestController {
    @Autowired
    public ApiProperties apiProperties = new ApiProperties();
    @RequestMapping(method= RequestMethod.GET,value="/byCity/{country}/{city}")
    public @ResponseBody Object getWeatherByCity(@PathVariable String city ){
        RestTemplate rt= new RestTemplate();
        ResponseEntity<Object> resp=rt.getForEntity(apiProperties.getUrl()+city+","+apiProperties.getCountry()+"&appid="+apiProperties.getApiKey(),Object.class);
        return resp;
    }
}
