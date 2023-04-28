package com.cebem.RickandMorty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class RickandMortyApplication {

	public static void main(String[] args) {
		SpringApplication.run(RickandMortyApplication.class, args);
	}

	@Bean
	public RestTemplate getrRestTemplate() {
		return new RestTemplate();
}
}
