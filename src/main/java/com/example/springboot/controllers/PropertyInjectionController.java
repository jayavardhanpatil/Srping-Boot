package com.example.springboot.controllers;

import com.example.springboot.services.GreetingService;
import com.example.springboot.services.GreetingServiceImpl;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 10/19/20
 * Time:  14:23
 */

public class PropertyInjectionController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.greeting();
    }

}