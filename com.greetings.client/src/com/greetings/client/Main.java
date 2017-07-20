package com.greetings.client;

import com.greetings.service.HelloWorldService;

public class Main {

    public static void main(String[] args) {
        HelloWorldService hello = new HelloWorldService();
        System.out.println(hello.sayHello());
    }

}
