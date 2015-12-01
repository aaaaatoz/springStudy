package com.rafa.spring;


public class HelloWorld {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name ;

    public void Hello(){
        System.out.println("Hello:" + name);
    }

}
