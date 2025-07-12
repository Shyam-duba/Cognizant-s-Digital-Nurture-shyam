package org.example.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
@RestController
public class HelloController {
    private final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello(){

        LOGGER.info("started executing sayHello!");

        LOGGER.info("Completed execution");

        return "Hello World!!";

    }
}
