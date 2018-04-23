package com.cy.test.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by Mars on 2015/3/11.
 */
@Slf4j
@Service
public class Count {

    private int count = 0;

    public void hit() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
