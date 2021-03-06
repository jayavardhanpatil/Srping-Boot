package com.example.springboot.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 10/19/20
 * Time:  14:22
 */

@Profile("EN")
@Service("i18nService")
public class i18nEnglishGreetingServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World";
    }
}