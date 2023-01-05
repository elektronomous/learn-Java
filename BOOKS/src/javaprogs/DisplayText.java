//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// DisplayText.java (Chapter 6, page 236)                   //
//////////////////////////////////////////////////////////////

// Displays text in three different colors and styles

import java.awt.*;
import jpb.*;

public class DisplayText {
  public static void main(String[] args) {
    // Create drawable frame
    DrawableFrame df = new DrawableFrame("Display Text");
    df.show();
    df.setSize(210, 85);

    // Obtain graphics context
    Graphics g = df.getGraphicsContext();

    // Display "Monospaced Bold"
    g.setColor(Color.red);
    g.setFont(new Font("Monospaced", Font.BOLD, 20));
    g.drawString("Monospaced Bold", 15, 25);

    // Display "SansSerif Italic"
    g.setColor(Color.green);
    g.setFont(new Font("SansSerif", Font.ITALIC, 20));
    g.drawString("SansSerif Italic", 15, 50);

    // Display "Serif Plain"
    g.setColor(Color.blue);
    g.setFont(new Font("Serif", Font.PLAIN, 20));
    g.drawString("Serif Plain", 15, 75);

    // Repaint frame
    df.repaint();
  }
}
