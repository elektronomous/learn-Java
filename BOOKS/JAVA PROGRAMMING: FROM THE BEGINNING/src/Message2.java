//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// Message2.java (Appendix D, page 750)                     //
//////////////////////////////////////////////////////////////

// Displays a message. The message and its coordinates are
// supplied as parameters.

import java.applet.*;
import java.awt.*;

public class Message2 extends Applet {
  private String message;
  private int x, y;

  // Called once, when the applet is created
  public void init() {
    message = getParameter("message");
    x = Integer.parseInt(getParameter("x"));
    y = Integer.parseInt(getParameter("y"));
  }

  // Called each time the applet needs to be redisplayed
  public void paint(Graphics g) {
    g.drawString(message, x, y);
  }
}
