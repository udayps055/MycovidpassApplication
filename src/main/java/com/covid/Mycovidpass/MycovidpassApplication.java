package com.covid.Mycovidpass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MycovidpassApplication {
	private static final Logger log = LoggerFactory.getLogger(MycovidpassApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MycovidpassApplication.class, args);
		//System.out.println("123");
	}
}
