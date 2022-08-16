package com.example.WeatherApp;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("api-properties")
@Data
public class ApiProperties {
    private String apiKey;
    private String url;
    private String country;



}
