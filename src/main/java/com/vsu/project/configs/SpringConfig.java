package com.vsu.project.configs;

import com.vsu.project.models.Apartment;
import com.vsu.project.models.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.vsu.project")
@PropertySource("classpath:project.properties")
public class SpringConfig {
    @Bean
    public Apartment apartment(){
        return new Apartment();
    }
    @Bean
    public Client client(){
        return new Client();
    }
}
