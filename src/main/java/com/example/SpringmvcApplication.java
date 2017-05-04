package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringmvcApplication {

	public static void main(String[] args) {

	    ApplicationContext ctx = SpringApplication.run(SpringmvcApplication.class, args);

//	    // Print list of all the beans loaded
//        System.out.println("Bean Info");
//	    System.out.println(ctx.getBeanDefinitionCount());
//	    for (String name : ctx.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
    }
}
