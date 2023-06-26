//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// ChangeColor.java (Chapter 12, page 499)                  //
//////////////////////////////////////////////////////////////

// Displays a frame containing a single button. Pressing the
// button causes the background of the frame to change from
// white to black or from black to white.

import java.awt.*;
import java.awt.event.*;

// Driver class
public class ChangeColor {
  public static void main(String[] args) {
    Frame f = new ChangeColorFrame("Change Color");
    f.setSize(160, 100);
    f.setVisible(true);
  }
}

// Frame class
class ChangeColorFrame extends Frame {
  public ChangeColorFrame(String title) {
    // Set title, layout, and background color
    super(title);
    setLayout(new FlowLayout());
    setBackground(Color.white);

    // Add "Change color" button to frame and attach listener
    Button b = new Button("Change color");
    add(b);
    b.addActionListener(new ButtonListener());

    // Attach window listener
    addWindowListener(new WindowCloser());
  }

  // Listener for button
  class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent evt) {
      if (getBackground() == Color.white)
        setBackground(Color.black);
      else
        setBackground(Color.white);
    }
  }

  // Listener for window
  class WindowCloser extends WindowAdapter {
    public void windowClosing(WindowEvent evt) {
      System.exit(0);
    }
  }
}
