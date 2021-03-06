package com.training.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Entry to bootstrap the application
@Configuration
@ComponentScan
@EnableAutoConfiguration
//@SpringBootApplication
public class Session1SpringBootAppApplication {

	public static void main(String[] args) {
		System.out.println("Spring Boot App Bootstrapped...");
		SpringApplication.run(Session1SpringBootAppApplication.class, args);
	}

	// Register a bean with the name userService
	@Bean
	public UserService userService() {
		return new UserService();
	}

}
