package com.example.springboot.controllers;

import com.example.springboot.services.GreetingService;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 10/19/20
 * Time:  14:26
 */

public class SetterInjectionConttroller {

    public GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.greeting();
    }



}