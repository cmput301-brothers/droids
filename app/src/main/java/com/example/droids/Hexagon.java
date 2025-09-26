package com.example.droids;

public class Hexagon extends Shape {
  protected int side;

  public Hexagon(int x, int y, int side) {
    super(x,y);
    this.side = side;
  }

  @Override
  public void draw() {};
}

