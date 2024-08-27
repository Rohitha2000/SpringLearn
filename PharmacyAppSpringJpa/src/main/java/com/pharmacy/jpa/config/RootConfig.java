package com.pharmacy.jpa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.pharmacy.jpa.repositories")
@EnableTransactionManagement
@ComponentScan(basePackageClasses = { PersistenceConfig.class, ServiceConfig.class })
public class RootConfig {

}
