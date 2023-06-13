package com.example.countriesjooq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/countries_states")
@SpringBootApplication
public class CountriesjooqApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountriesjooqApplication.class, args);
	}

}
