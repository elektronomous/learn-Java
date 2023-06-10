//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// Message.java (Appendix D, page 748)                      //
//////////////////////////////////////////////////////////////

// Displays a message. The message and its coordinates are
// supplied as parameters.

import java.applet.*;
import java.awt.*;

public class Message extends Applet {
  public void paint(Graphics g) {
    String message = getParameter("message");
    int x = Integer.parseInt(getParameter("x"));
    int y = Integer.parseInt(getParameter("y"));
    g.drawString(message, x, y);
  }
}
