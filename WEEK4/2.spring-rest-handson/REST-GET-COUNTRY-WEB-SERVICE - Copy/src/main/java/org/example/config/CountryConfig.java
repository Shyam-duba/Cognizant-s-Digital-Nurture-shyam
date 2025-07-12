package org.example.config;

import org.example.model.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CountryConfig {

    @Bean(name = "countryIndia")
    public Country countryIndia() {
        return new Country("IN", "India");
    }

    @Bean(name = "countryUSA")
    public Country countryUSA() {
        return new Country("US", "United States");
    }

    @Bean(name = "countryJapan")
    public Country countryJapan() {
        return new Country("JP", "Japan");
    }
}
