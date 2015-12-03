package com.rafa.spring;


public class TriangleDraw {

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    public void draw(){
        System.out.println("My Type is " + getType());
    }
}
