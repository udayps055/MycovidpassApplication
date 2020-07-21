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
	@Bean
	public CommandLineRunner demo(UserRepo reposi) {
		return (args) -> {
			// fetch an individual customer by ID
			d2 custo = reposi.findById(1L);
			log.info("Customer found with findById(1L):");
			log.info("--------------------------------");
			log.info(custo.toString());
			log.info("");
		};
	}
}
