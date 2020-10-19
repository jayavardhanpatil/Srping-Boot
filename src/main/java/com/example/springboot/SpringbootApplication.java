package com.example.springboot;

import com.example.springboot.controllers.MyController;
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

	}

}
