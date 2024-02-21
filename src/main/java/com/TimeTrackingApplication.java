package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class TimeTrackingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeTrackingApplication.class, args);
	}
	
	@Bean
	public BCryptPasswordEncoder createEncryptPassword(){
		BCryptPasswordEncoder encodedPass = new BCryptPasswordEncoder();
		return encodedPass;
		
	}

}
