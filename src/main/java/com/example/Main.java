package com.example;

import com.example.service.GreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GreetingService greetingService = context.getBean(GreetingService.class);

        greetingService.sayHello("ABCD");
        greetingService.sayGoodBye("ABCD");

        context.close();
    }
}
