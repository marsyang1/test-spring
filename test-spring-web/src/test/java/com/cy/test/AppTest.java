package com.cy.test;

import com.cy.test.bo.User;
import com.cy.test.service.Count;
import com.cy.test.service.UserManager;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Mars on 2015/3/11.
 */
@Slf4j
public class AppTest {

    @Test
    public void test1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                WebApplication.class);

        UserManager manager = (UserManager) context.getBean("userManager");
        User user = manager.find("test");

        log.info("user =" + user);

        log.info("--------------test count ---------------");

        Count count = (Count) context.getBean("count");
        Count count2 = (Count) context.getBean("count");

        count.hit();
        count2.hit();

        log.info("count = " + count.getCount());
        if (count.getCount() == 2) {
            log.info("spring default is singleton");
        }
    }
}
