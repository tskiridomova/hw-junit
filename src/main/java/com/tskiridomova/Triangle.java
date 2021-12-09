package com.tskiridomova;

class WrongTriangleException extends Exception
{
  public WrongTriangleException(String message)
  {
    super(message);
  }
}

public class Triangle {
  private final int a, b, c;

  public Triangle(int a, int b, int c) throws Exception {

    if (a >= b+c || b >= a+c || c >= a+b) {
      throw new WrongTriangleException("Triangle does not exists");
    }

    this.a = a;
    this.b = b;
    this.c = c;

  }

  public double getArea() {
    double halfP = (double)(a+b+c)/2;
    double area = (halfP * (halfP- a)* (halfP -b)* (halfP -c));
    return Math.sqrt(area);
  }
}
