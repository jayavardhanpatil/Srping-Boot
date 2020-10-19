package com.example.springboot.services;

import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 10/19/20
 * Time:  14:22
 */

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World - setter";
    }
}