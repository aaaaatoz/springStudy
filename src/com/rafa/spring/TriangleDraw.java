package com.rafa.spring;


public class TriangleDraw {


    public TriangleDraw(String type, int height) {
        this.type = type;
        this.height = height;
    }

    private String type;
    private int height;

    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }


    public void draw(){
        System.out.println("My Type is " + getType());
        System.out.println("My height is " + getHeight());
    }
}
