//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// DisplayText2.java (Chapter 7, page 280)                  //
//////////////////////////////////////////////////////////////

// Displays text in three different colors and styles

import java.awt.*;
import jpb.*;

public class DisplayText2 {
  private static Graphics g;  // Class variable

  public static void main(String[] args) {
    // Create drawable frame
    DrawableFrame df = new DrawableFrame("Display Text");
    df.show();
    df.setSize(210, 85);

    // Obtain graphics context
    g = df.getGraphicsContext();

    // Display "Monospaced Bold"
    displayFont(Color.red, "Monospaced", Font.BOLD,
                "Monospaced Bold", 25);

    // Display "SansSerif Italic"
    displayFont(Color.green, "SansSerif", Font.ITALIC,
                "SansSerif Italic", 50);

    // Display "Serif Plain"
    displayFont(Color.blue, "Serif", Font.PLAIN,
                "Serif Plain", 75);

    // Repaint frame
    df.repaint();
  }

  private static void displayFont(Color c, String fontName,
                                  int fontStyle,
                                  String message, int y) {
    g.setColor(c);
    g.setFont(new Font(fontName, fontStyle, 20));
    g.drawString(message, 15, y);
  }
}
