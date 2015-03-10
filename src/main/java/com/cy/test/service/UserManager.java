package com.cy.test.service;

import com.cy.test.bo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mars on 2015/3/11.
 */
@Slf4j
@Service
public class UserManager {

    @Autowired
    private UserRepo repo;

    public UserManager(){
        log.info("run default constructor");
    }

    public User find(String id) {
        return repo.find();
    }


}

