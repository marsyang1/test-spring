package com.cy.test.bo;

import lombok.Data;

/**
 * Created by Mars on 2015/3/11.
 */
@Data
public class User {

    private String id;
    private String name;

    public User(String userId, String userName) {
        this.id = userId;
        this.name = userName;
    }
}
