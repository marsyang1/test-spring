package com.cy.test.config;

import com.cy.test.service.UserManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Mars on 2015/3/11.
 */
@Configuration
@ComponentScan("com.cy")
public class AppConfig {

    @Bean
    public UserManager userManager() {
        return new UserManager();
    }

}
