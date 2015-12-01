package com.rafa.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloworld");

        helloWorld.Hello();
    }
}
