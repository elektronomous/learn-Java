//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// RandomCircles.java (Chapter 9, page 372)                 //
//////////////////////////////////////////////////////////////

// Program name: RandomCircles
// Author: K. N. King
// Written: 1998-05-19
// Revised: 1999-04-25
// 
// Draws randomly generated circles within a frame. The user
// will enter the size of the frame, the number of circles to
// be drawn, and the "delay time," which controls the drawing
// speed. If the user enters a non-integer value, the program
// will ask the user to re-enter the input. The location,
// radius, and color of each circle is chosen randomly. The
// radius is at most the frame size divided by 4. The random
// location is chosen so that the circle is entirely contained
// within the frame. Each circle is drawn as 360 lines. The
// lines are drawn in clockwise order, starting from the 12
// o'clock position. The delay time entered by the user
// determines the amount of delay between successive lines.

import java.awt.*;
import jpb.*;

public class RandomCircles {
  private static DrawableFrame df; // Frame in which
                                   //   circles are displayed
  private static Graphics g;       // Graphics context for
                                   //   frame
  private static int delay;        // Delay between lines
                                   //   (milliseconds)
  private static int numCircles;   // Number of circles
  private static int frameSize;    // Size of frame (pixels)

  public static void main(String[] args) {
    // Prompt the user to enter the frame size, the number of
    // circles, and the delay
    frameSize = readInt("Enter frame size: ");
    numCircles = readInt("Enter number of circles: ");
    delay = readInt("Enter delay (in milliseconds): ");

    // Create a frame titled "Random Circles" and set its
    // size to the value entered by the user
    df = new DrawableFrame("Random Circles");
    df.show();
    df.setSize(frameSize, frameSize);

    // Get the frame's graphics context
    g = df.getGraphicsContext();

    // Draw a series of circles
    drawAllCircles();
  }

  ///////////////////////////////////////////////////////////
  // NAME:       drawAllCircles
  // BEHAVIOR:   Draws a series of circles with random
  //             colors, sizes, and locations. The number of
  //             circles is determined by numCircles. The
  //             radius of each circle is at most
  //             frameSize/4. The center of each circle is
  //             chosen so that the circle stays within the
  //             frame.
  // PARAMETERS: None
  // RETURNS:    Nothing
  ///////////////////////////////////////////////////////////
  private static void drawAllCircles() {
    for (int i = 0; i < numCircles; i++) {
      // Select a color in which each component is a random
      // number between 0 and 255
      int red = (int) (256 * Math.random());
      int green = (int) (256 * Math.random());
      int blue = (int) (256 * Math.random());
      Color color = new Color(red, green, blue);

      // Select a random radius between 0 and frameSize/4
      int radius =
        (int) ((frameSize / 4 + 1) * Math.random());

      // Select a random center with each coordinate between
      // radius and frameSize - radius.
      int xCenter = radius + 
        (int) ((frameSize - 2 * radius + 1) * Math.random());
      int yCenter = radius +
        (int) ((frameSize - 2 * radius + 1) * Math.random());

      // Display a circle with the chosen center, radius, and
      // color
      drawOneCircle(xCenter, yCenter, radius, color);
    }
  }

  ///////////////////////////////////////////////////////////
  // NAME:       drawOneCircle
  // BEHAVIOR:   Draws one circle with the specified center,
  //             radius, and color. The circle is drawn as a
  //             series of 360 lines meeting at the center of
  //             the circle. Lines are drawn clockwise,
  //             starting from the 12 o'clock position. The
  //             amount of delay between successive lines
  //             (measured in milliseconds) is determined by
  //             the value of the delay variable.
  // PARAMETERS: xCenter - x coordinate of center of circle
  //             yCenter - y coordinate of center of circle
  //             radius - radius of circle in pixels
  //             color - color of circle
  // RETURNS:    Nothing
  ///////////////////////////////////////////////////////////
  private static void drawOneCircle(int xCenter, int yCenter,
                                    int radius, Color color) {
    // Change drawing color
    g.setColor(color);

    for (int angle = 360; angle >= 1; angle--) {
      // Compute coordinates of current line's endpoint (the
      // one at the edge of the circle)
      double radians = (angle + 90) * Math.PI / 180;
      int xEdge = 
        xCenter + (int) (Math.cos(radians) * radius);
      int yEdge = 
        yCenter - (int) (Math.sin(radians) * radius);

      // Draw line from center of circle to edge of circle
      g.drawLine(xCenter, yCenter, xEdge, yEdge);

      // Call repaint to update the screen
      df.repaint();

      // Pause between successive lines
      try {
        Thread.sleep(delay);
      } catch (InterruptedException e) {}
    }
  }

  ///////////////////////////////////////////////////////////
  // NAME:       readInt
  // BEHAVIOR:   Prompts the user to enter a number, reads
  //             the user's input, and converts it to int
  //             form. If the conversion fails, the user is
  //             prompted to re-enter the input. The process
  //             repeats indefinitely until the user's input
  //             represents a valid integer.
  // PARAMETERS: prompt - the prompt to be displayed
  // RETURNS:    User's input after conversion to int
  ///////////////////////////////////////////////////////////
  private static int readInt(String prompt) {
    while (true) {
      SimpleIO.prompt(prompt);
      String userInput = SimpleIO.readLine();
      try {
        return Integer.parseInt(userInput);
      } catch (NumberFormatException e) {
        System.out.println("Not an integer; try again.");
      }
    }
  }
}
