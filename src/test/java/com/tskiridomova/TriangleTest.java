package com.tskiridomova;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;

public class TriangleTest {

  @Test
    public void shouldReturnCorrectArea() throws Exception {
        Triangle triangle = new Triangle(1,1,1);
        assertEquals(0.43, triangle.getArea(), 0.01);
    }

  @Test(expected=WrongTriangleException.class)
  public void shouldThrowWrongTriangle() throws Exception {
    Triangle triangle = new Triangle(1,2,3);
  }
}
