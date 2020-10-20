package com.example.springboot;

import com.example.springboot.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.applet.AppletContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);

		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.helloWorld());

		System.out.println("------ Primary");
		MyController controller = (MyController) context.getBean("myController");
		System.out.println(controller.helloWorld());

		//DI
		System.out.println("------ Property");
		PropertyInjectionController propertyInjectedController = (PropertyInjectionController) context.getBean("propertyInjectionController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter");
		SetterInjectionConttroller setterInjectedController = (SetterInjectionConttroller) context.getBean("setterInjectionConttroller");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor" );
		ConstructorInjectionController constructorInjectedController = (ConstructorInjectionController) context.getBean("constructorInjectionController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
