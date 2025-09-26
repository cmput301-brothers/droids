package com.example.droids;

public abstract class Shape {
    protected int x;
    protected int y;
    protected String color = "red";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw(); // Example abstract method
}

