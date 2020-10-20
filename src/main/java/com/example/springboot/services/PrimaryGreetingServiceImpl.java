package com.example.springboot.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 10/19/20
 * Time:  14:22
 */

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World - Primary";
    }
}