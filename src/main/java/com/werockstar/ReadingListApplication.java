package com.werockstar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
	@SpringBootApplication, Combines(@Configuration, @ComponentScan, @EnableAutoConfiguration)
	Enable component-scanning and Auto configuration

 */
@SpringBootApplication
public class ReadingListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadingListApplication.class, args);
	}
}
