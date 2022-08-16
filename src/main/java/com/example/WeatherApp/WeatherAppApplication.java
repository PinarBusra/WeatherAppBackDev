package com.example.WeatherApp;

import com.example.WeatherApp.controller.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(ApiProperties.class)

public class WeatherAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherAppApplication.class, args);

	}

	/*@Bean
	ApplicationRunner runner(ApiProperties apiProperties)
	{

		return args->{System.out.println(apiProperties);};
	}*/
}
