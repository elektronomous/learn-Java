//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// StopSign2.java (Appendix D, page 752)                    //
//////////////////////////////////////////////////////////////

// Displays a stop sign (applet version)

import java.applet.*;
import java.awt.*;

public class StopSign2 extends Applet {
  // Coordinates of outer polygon (edge of sign) and inner
  // polygon (red portion)
  private int[] xOuter = {36, 87, 123, 123, 87, 36, 0, 0};
  private int[] yOuter = {0, 0, 36, 87, 123, 123, 87, 36};
  private int[] xInner = {37, 86, 118, 118, 86, 37, 5, 5};
  private int[] yInner = {5, 5, 37, 86, 118, 118, 86, 37};

  public void init() {
    setBackground(Color.white);
  }

  public void paint(Graphics g) {
    // Draw edge of sign in black
    g.setColor(Color.black);
    g.drawPolygon(xOuter, yOuter, xOuter.length);

    // Fill interior of sign with red
    g.setColor(Color.red);
    g.fillPolygon(xInner, yInner, xInner.length);

    // Display "STOP" in white
    g.setColor(Color.white);
    g.setFont(new Font("SansSerif", Font.BOLD, 36));
    g.drawString("STOP", 13, 76);
  }
}
