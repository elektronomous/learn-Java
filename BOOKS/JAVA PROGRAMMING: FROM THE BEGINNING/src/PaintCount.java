//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// PaintCount.java (Appendix D, page 749)                   //
//////////////////////////////////////////////////////////////

// Displays the number of times paint has been called.

import java.applet.*;
import java.awt.*;

public class PaintCount extends Applet {
  private int count = 0;

  public void paint(Graphics g) {
    count++;
    g.drawString("Number of times paint called: " + count,
                 10, 20);
  }
}
