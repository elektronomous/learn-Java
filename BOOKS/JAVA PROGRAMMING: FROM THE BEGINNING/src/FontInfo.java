//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// FontInfo.java (Chapter 6, page 241)                      //
//////////////////////////////////////////////////////////////

// Displays information about a font. Uses the FontMetrics
// class to obtain the information to be displayed.

import java.awt.*;
import jpb.*;

public class FontInfo {
  public static void main(String[] args) {
    // Create drawable frame
    DrawableFrame df = new DrawableFrame("Font Information");
    df.show();
    df.setSize(215, 175);

    // Get graphics context
    Graphics g = df.getGraphicsContext();

    // Create font, get metrics for font, and compute height
    // of font
    Font f = new Font("SansSerif", Font.PLAIN, 20);
    FontMetrics fm = g.getFontMetrics(f);
    int height = fm.getHeight();

    // Display information about font
    g.setFont(f);
    g.drawString("Ascent: " + fm.getAscent(), 10, height);
    g.drawString("Descent: " + fm.getDescent(), 10,
                 height * 2);
    g.drawString("Height: " + height, 10, height * 3);
    g.drawString("Leading: " + fm.getLeading(), 10,
                 height * 4);
    g.drawString("Maximum advance: " + fm.getMaxAdvance(), 10,
                 height * 5);
    g.drawString("Width of \"Why?\": " + 
                 fm.stringWidth("Why?"), 10, height * 6);

    // Repaint frame
    df.repaint();
  }
}
