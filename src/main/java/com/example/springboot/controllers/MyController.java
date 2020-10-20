package com.example.springboot.controllers;

import com.example.springboot.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 10/19/20
 * Time:  12:39
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String helloWorld(){
        return greetingService.greeting();
    }

}
