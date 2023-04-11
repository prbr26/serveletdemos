package com.mjava.SportyShoesOnline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan("com.mjava")

@EntityScan("com.mjava.model")
@EnableJpaRepositories("com.mjava.dao")
public class SportyShoesOnlineApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SportyShoesOnlineApplication.class, args);
		
	}
	
	 

}
