package com.jcsbc.hcrm360;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class Hcrm360ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Hcrm360ApiApplication.class, args);
    }

}
