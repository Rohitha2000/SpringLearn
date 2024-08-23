package com.pharmacy.jpa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.pharmacy.jpa.services")
public class ServiceConfig {

}
