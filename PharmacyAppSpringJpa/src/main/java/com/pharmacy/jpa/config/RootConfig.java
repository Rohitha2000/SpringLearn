package com.pharmacy.jpa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = { PersistenceConfig.class, ServiceConfig.class })
public class RootConfig {

}
