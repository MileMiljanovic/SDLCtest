package com.sdlc.hello;

import java.sql.Timestamp;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	@Bean
	public void hello() {
		System.out.println("Hello there Savo! Current date and time is: " + new Timestamp(System.currentTimeMillis()));
	}

}
