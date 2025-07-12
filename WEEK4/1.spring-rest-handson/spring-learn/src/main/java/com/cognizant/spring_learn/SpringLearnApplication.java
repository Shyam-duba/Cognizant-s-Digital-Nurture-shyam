package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@SpringBootApplication
public class SpringLearnApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
		LOGGER.info("Inside the main function of starting the application:)");
		SpringApplication.run(SpringLearnApplication.class, args);
		LOGGER.info("exiting the main function");
	}

}
