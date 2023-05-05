//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// DrawLine.java (Chapter 6, page 226)                      //
//////////////////////////////////////////////////////////////

// Draws a line inside a frame

import java.awt.*;
import jpb.*;

public class DrawLine {
  public static void main(String[] args) {
    // Create drawable frame
    DrawableFrame df = new DrawableFrame("Draw Line");
    df.show();
    df.setSize(150, 150);

    // Obtain graphics context
    Graphics g = df.getGraphicsContext();

    // Draw line
    g.drawLine(50, 50, 100, 100);

    // Repaint frame
    df.repaint();
  }
}
