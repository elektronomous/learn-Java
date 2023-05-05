//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// FrameTest.java (Chapter 12, page 489)                    //
//////////////////////////////////////////////////////////////

// Displays a frame on the screen.
// WARNING: Frame cannot be closed.

import java.awt.*;

public class FrameTest {
  public static void main(String[] args) {
    Frame f = new Frame("Frame Test");
    f.setSize(150, 100);
    f.setVisible(true);
  }
}
