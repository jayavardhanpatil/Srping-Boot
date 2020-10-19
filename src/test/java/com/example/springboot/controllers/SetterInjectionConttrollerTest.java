package com.example.springboot.controllers;

import com.example.springboot.services.GreetingService;
import com.example.springboot.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectionConttrollerTest {

    public SetterInjectionConttroller conttroller;

    @BeforeEach
    void setUp() {
        conttroller = new SetterInjectionConttroller();
        conttroller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(conttroller.getGreeting());
    }
}