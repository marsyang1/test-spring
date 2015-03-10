package com.cy.test.main;

import com.cy.test.bo.User;
import com.cy.test.config.AppConfig;
import com.cy.test.service.UserManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Mars on 2015/3/11.
 */
@Slf4j
public class AppTest {

    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);

        UserManager manager = (UserManager) context.getBean("userManager");
        User user = manager.find("test");

        log.info("user =" + user);

    }
}
