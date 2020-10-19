package com.example.springboot.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 10/19/20
 * Time:  12:39
 */
@Controller
public class MyController {

    public String helloWorld(){
        System.out.println("Hello World!");
        return "Hello Man!";
    }

}
