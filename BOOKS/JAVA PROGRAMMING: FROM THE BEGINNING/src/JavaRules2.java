//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// JavaRules2.java (Appendix D, page 744)                   //
//////////////////////////////////////////////////////////////

// Displays the message "Java rules!"

import java.applet.*;
import java.awt.*;

public class JavaRules2 extends Applet {
  public void paint(Graphics g) {
    g.drawString("Java rules!", 50, 25);
  }
}
