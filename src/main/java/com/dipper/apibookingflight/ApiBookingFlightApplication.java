package com.dipper.apibookingflight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApiBookingFlightApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApiBookingFlightApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiBookingFlightApplication.class, args);
    }

}
