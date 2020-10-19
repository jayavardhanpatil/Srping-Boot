package com.example.springboot.controllers;

import com.example.springboot.services.GreetingService;
import com.example.springboot.services.PropertyGreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 10/19/20
 * Time:  14:23
 */

@Controller
public class PropertyInjectionController {

    @Autowired
    @Qualifier("propertyGreetingServiceImpl")
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.greeting();
    }

}