package com.cy.test.service;

import com.cy.test.bo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mars on 2015/3/11.
 */
@Service
public class UserManager {

    @Autowired
    private UserRepo repo;

    public User find(String id) {
        return repo.find();
    }


}
