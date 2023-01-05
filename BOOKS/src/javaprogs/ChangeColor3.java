//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// ChangeColor3.java (Chapter 12, page 504)                 //
//////////////////////////////////////////////////////////////

// Displays a frame containing two buttons. Pressing the
// "Lighter" button lightens the background of the frame.
// Pressing the "Darker" button darkens the background.

import java.awt.*;
import java.awt.event.*;

// Driver class
public class ChangeColor3 {
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
    setBackground(Color.gray);

    // Add "Lighter" button to frame and attach listener
    Button b = new Button("Lighter");
    add(b);
    b.addActionListener(new LighterButtonListener());

    // Add "Darker" button to frame and attach listener
    b = new Button("Darker");
    add(b);
    b.addActionListener(new DarkerButtonListener());

    // Attach window listener
    addWindowListener(new WindowCloser());
  }

  // Listener for "Lighter" button
  class LighterButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent evt) {
      setBackground(getBackground().brighter());
    }
  }

  // Listener for "Darker" button
  class DarkerButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent evt) {
      setBackground(getBackground().darker());
    }
  }

  // Listener for window
  class WindowCloser extends WindowAdapter {
    public void windowClosing(WindowEvent evt) {
      System.exit(0);
    }
  }
}
