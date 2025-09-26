package com.example.droids;

public class Triangle extends Shape {
    public Triangle(int x, int y) {
        super(x, y);
    }
    @Override
    public void draw(){
        //implentation
    }

    public float getArea(){
        float area = this.x*this.y/2.0f;
        return area;
    }

}