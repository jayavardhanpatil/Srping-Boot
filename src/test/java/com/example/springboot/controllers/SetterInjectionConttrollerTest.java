package com.example.springboot.controllers;

import com.example.springboot.services.SetterGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectionConttrollerTest {

    public SetterInjectionConttroller conttroller;

    @BeforeEach
    void setUp() {
        conttroller = new SetterInjectionConttroller();
        conttroller.setGreetingService(new SetterGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(conttroller.getGreeting());
    }
}