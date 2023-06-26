//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// ButtonTest3.java (Chapter 12, page 497)                  //
//////////////////////////////////////////////////////////////

// Displays a frame containing a single "Close window"
// button. The frame can be closed by pressing either the
// "Close window" button or the frame's "close" button.

import java.awt.*;
import java.awt.event.*;

// Driver class
public class ButtonTest3 {
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
    Button b = new Button("Close window");
    add(b);
    b.addActionListener(new ButtonListener());

    // Attach window listener
    addWindowListener(new WindowCloser());
  }
}

// Listener for button
class ButtonListener implements ActionListener {
  public void actionPerformed(ActionEvent evt) {
    System.exit(0);
  }
}

// Listener for window
class WindowCloser extends WindowAdapter {
  public void windowClosing(WindowEvent evt) {
    System.exit(0);
  }
}
