package com.webservice.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.webservice.course.entities.User;
import com.webservice.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null,"Felipe", "felipe@gmail.com", "77999676767", "12345678");
		User u2 = new User(null,"Maria", "maria@gmail.com", "77999696969", "12345678");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
	
}
