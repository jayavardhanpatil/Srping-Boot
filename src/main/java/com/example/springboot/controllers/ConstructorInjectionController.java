package com.example.springboot.controllers;

import com.example.springboot.services.GreetingService;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 10/19/20
 * Time:  14:33
 */

public class ConstructorInjectionController {

    private final GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.greeting();
    }

}