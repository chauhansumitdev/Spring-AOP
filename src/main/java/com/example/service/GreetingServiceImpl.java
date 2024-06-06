package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    @Override
    public void sayHello(String name) {
        System.out.print("Welcome "+name);
    }

    @Override
    public void sayGoodBye(String name) {
        System.out.print("bye "+name);
    }
}
