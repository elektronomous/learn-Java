//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// NervousShapes.java (Chapter 11, page 473)                //
//////////////////////////////////////////////////////////////

// Program name: NervousShapes
// Author: K. N. King
// Written: 1999-08-12
// 
// Displays a frame containing a random mixture of circles
// and rectangles with random colors, sizes, and positions.
// The shapes periodically change position, with the 
// direction of motion chosen randomly for each shape. The
// new x coordinate for each shape will either be the same
// as the old x coordinate, one pixel smaller, or one pixel
// larger; the new y coordinate will be computed in a
// similar manner. Shapes will be constrained so that they
// do not move outside the drawing area.

import java.awt.*;
import jpb.*;

public class NervousShapes {
  // Constants
  private static final int DELAY = 10;
    // Animation delay (milliseconds)
  private static final int MAX_SIZE = 20;
    // Maximum width and height of a shape
  private static final int MIN_SIZE = 10;
    // Minimum width and height of a shape
  private static final int NUM_SHAPES = 50;
    // Number of shapes
  private static final int WINDOW_SIZE = 200;
    // Width and height of drawable portion of frame

  // Class variables
  private static DrawableFrame df;
    // Frame in which shapes are displayed
  private static Graphics g;
    // Graphics context for frame
  private static Shape shapes[] = new Shape[NUM_SHAPES];
    // Array of shapes

  public static void main(String[] args) {
    createWindow();
    createShapes();
    animateShapes();
  }

  ///////////////////////////////////////////////////////////
  // NAME:       createWindow
  // BEHAVIOR:   Creates a frame labeled "Nervous Shapes",
  //             displays the frame, and sets the size of
  //             the frame (using the WINDOW_SIZE class
  //             variable). Assigns the frame to the df
  //             class variable, and assigns the frame's
  //             graphics context to the g class variable.
  // PARAMETERS: None
  // RETURNS:    Nothing
  ///////////////////////////////////////////////////////////
  private static void createWindow() {
    // Create a frame labeled "Nervous Shapes" and set its
    // size
    df = new DrawableFrame("Nervous Shapes");
    df.show();
    df.setSize(WINDOW_SIZE, WINDOW_SIZE);

    // Get the frame's graphics context
    g = df.getGraphicsContext();
  }

  ///////////////////////////////////////////////////////////
  // NAME:       createShapes
  // BEHAVIOR:   Creates enough Circle and Rectangle objects
  //             to fill the shapes array. Each shape has a
  //             random color, size, and position. The height
  //             and width of each shape must lie between
  //             MIN_SIZE and MAX_SIZE (inclusive). The
  //             position is chosen so that the shape is
  //             completely within the drawing area.
  // PARAMETERS: None
  // RETURNS:    Nothing
  ///////////////////////////////////////////////////////////
  private static void createShapes() {
    for (int i = 0; i < shapes.length; i++) {
      // Select a random color
      int red = generateRandomInt(0, 255);
      int green = generateRandomInt(0, 255);
      int blue = generateRandomInt(0, 255);
      Color color = new Color(red, green, blue);

      // Decide whether to create a circle or a rectangle
      if (Math.random() < 0.5)  {
        // Generate a circle with a random size and position
        int diameter = generateRandomInt(MIN_SIZE, MAX_SIZE);
        int x = generateRandomInt(0, WINDOW_SIZE - diameter);
        int y = generateRandomInt(0, WINDOW_SIZE - diameter);
        shapes[i] = new Circle(x, y, color, diameter);
      } else {
        // Generate a rectangle with a random size and
        // position
        int width = generateRandomInt(MIN_SIZE, MAX_SIZE);
        int height = generateRandomInt(MIN_SIZE, MAX_SIZE);
        int x = generateRandomInt(0, WINDOW_SIZE - width);
        int y = generateRandomInt(0, WINDOW_SIZE - height);
        shapes[i] = new Rectangle(x, y, color, width, height);
      }
    }
  }

  ///////////////////////////////////////////////////////////
  // NAME:       animateShapes
  // BEHAVIOR:   Establishes an infinite loop in which the
  //             shapes are animated. During each loop
  //             iteration, the drawing area is cleared and
  //             the shapes are then drawn at new positions.
  //             The new x and y coordinates for each shape
  //             will either be the same as the old ones,
  //             one pixel smaller, or one pixel larger. A
  //             shape is not moved if doing so would cause
  //             any portion of the shape to go outside the
  //             drawing area. At the end of each animation
  //             cycle, there is a brief pause, which is
  //             controlled by the delay constant.
  // PARAMETERS: None
  // RETURNS:    Nothing
  ///////////////////////////////////////////////////////////
  private static void animateShapes() {
    while (true) {
      // Clear drawing area
      g.setColor(Color.white);
      g.fillRect(0, 0, WINDOW_SIZE - 1, WINDOW_SIZE - 1);

      for (int i = 0; i < shapes.length; i++) {
        // Change the x coordinate for shape i
        int dx = generateRandomInt(-1, +1);
        int newX = shapes[i].getX() + dx;
        if (newX >= 0 && 
            newX + shapes[i].getWidth() < WINDOW_SIZE)
          shapes[i].move(dx, 0);

        // Change the y coordinate for shape i
        int dy = generateRandomInt(-1, +1);
        int newY = shapes[i].getY() + dy;
        if (newY >= 0 && 
            newY + shapes[i].getHeight() < WINDOW_SIZE)
          shapes[i].move(0, dy);

        // Draw shape i at its new position
        shapes[i].draw(g);
      }

      // Call repaint to update the screen
      df.repaint();

      // Pause briefly
      try {
        Thread.sleep(DELAY);
      } catch (InterruptedException e) {}
    }
  }

  ///////////////////////////////////////////////////////////
  // NAME:       generateRandomInt
  // BEHAVIOR:   Generates a random integer within a
  //             specified range.
  // PARAMETERS: min - the lower bound of the range
  //             max - the upper bound of the range
  // RETURNS:    A random integer that is greater than or
  //             equal to min and less than or equal to max
  ///////////////////////////////////////////////////////////
  private static int generateRandomInt(int min, int max) {
    return (int) ((max - min + 1) * Math.random()) + min;
  }
}
