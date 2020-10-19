package com.example.springboot;

import com.example.springboot.controllers.ConstructorInjectionController;
import com.example.springboot.controllers.MyController;
import com.example.springboot.controllers.PropertyInjectionController;
import com.example.springboot.controllers.SetterInjectionConttroller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.applet.AppletContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);

		MyController controller = (MyController) context.getBean("myController");

		String greeting = controller.helloWorld();
		System.out.println(greeting);

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
