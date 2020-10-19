package com.example.springboot.services;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 10/19/20
 * Time:  14:22
 */

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World";
    }
}