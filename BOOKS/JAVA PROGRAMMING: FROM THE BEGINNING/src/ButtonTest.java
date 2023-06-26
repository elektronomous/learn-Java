//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// ButtonTest.java (Chapter 12, page 491)                   //
//////////////////////////////////////////////////////////////

// Displays a frame containing a single button.
// WARNING: Frame cannot be closed.

import java.awt.*;

// Driver class
public class ButtonTest {
  public static void main(String[] args) {
    Frame f = new ButtonTestFrame("Button Test");
    f.setSize(150, 100);
    f.setVisible(true);
  }
}

// Frame class
class ButtonTestFrame extends Frame {
  public ButtonTestFrame(String title) {
    super(title);
    setLayout(new FlowLayout());
    Button b = new Button("Testing");
    add(b);
  }
}
