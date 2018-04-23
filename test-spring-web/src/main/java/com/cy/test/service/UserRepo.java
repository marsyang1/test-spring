package com.cy.test.service;

import com.cy.test.bo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * Created by Mars on 2015/3/11.
 */
@Slf4j
@Repository
public class UserRepo {

    public UserRepo() {
        log.info("run default constructor");
    }

    public User find() {
        return new User("mars", "Mars");
    }
}
