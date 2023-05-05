//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// Circle.java (Chapter 11, page 463)                       //
//////////////////////////////////////////////////////////////

// Represents a circle that can be displayed in a graphics
// context

import java.awt.*;

public class Circle extends Shape {
  // Instance variables
  private int diameter;

  // Constructor
  public Circle(int x, int y, Color color, int diameter) {
    super(x, y, color);
    this.diameter = diameter;
  }

  // Instance methods
  public void draw(Graphics g) {
    g.setColor(getColor());
    g.fillOval(getX(), getY(), diameter, diameter);
  }

  public int getHeight() {
    return diameter;
  }

  public int getWidth() {
    return diameter;
  }
}
