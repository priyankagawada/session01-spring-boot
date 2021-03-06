package com.training.boot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.boot.service.IProjectService;
import com.training.boot.service.IProjectServiceImpl;

@Configuration
public class BeanConfiguration {

	// Bean registered in the container
	@Bean
	public IProjectService iProjectService() {
		return new IProjectServiceImpl();
	}
	
	// IProjectRepository Bean
	
}
