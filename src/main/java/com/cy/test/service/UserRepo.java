package com.cy.test.service;

import com.cy.test.bo.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Mars on 2015/3/11.
 */
@Repository
public class UserRepo {

    public User find(){
        return new User("mars","Mars");
    }
}
