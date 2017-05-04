package com.example.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ActiveProfiles;

/**
 * Created by jeff on 5/1/2017.
 */
//Specific configuration for testing

@Component
// Tells Spring Boot to use sensible defaults
@EnableAutoConfiguration
// Tells Spring to review all classes
@ComponentScan("com.example")

public class JpaIntegrationConfig {
}
