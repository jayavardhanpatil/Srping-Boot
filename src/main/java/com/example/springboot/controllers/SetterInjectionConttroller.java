package com.example.springboot.controllers;

import com.example.springboot.services.GreetingService;
import com.example.springboot.services.SetterGreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 10/19/20
 * Time:  14:26
 */
@Controller
public class SetterInjectionConttroller {

    @Autowired
    @Qualifier("setterGreetingServiceImpl")
    public GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.greeting();
    }



}