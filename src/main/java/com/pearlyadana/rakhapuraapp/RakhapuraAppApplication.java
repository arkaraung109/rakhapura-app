package com.pearlyadana.rakhapuraapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class RakhapuraAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RakhapuraAppApplication.class, args);
	}

}
