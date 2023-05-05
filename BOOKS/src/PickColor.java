//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// PickColor.java (Chapter 12, page 527)                    //
//////////////////////////////////////////////////////////////

// Allows the user to pick a color by moving three scrollbars

import java.awt.*;
import java.awt.event.*;

// Driver class
public class PickColor {
  public static void main(String[] args) {
    Frame f = new PickColorFrame("Pick Color");
    f.setSize(150, 200);
    f.setVisible(true);
  }
}

// Frame class
class PickColorFrame extends Frame {
  private Label redLabel = 
    new Label("Red = 128", Label.CENTER);
  private Label greenLabel = 
    new Label("Green = 128", Label.CENTER);
  private Label blueLabel = 
    new Label("Blue = 128", Label.CENTER);
  private Scrollbar redBar = 
    new Scrollbar(Scrollbar.HORIZONTAL, 128, 1, 0, 256);
  private Scrollbar greenBar = 
    new Scrollbar(Scrollbar.HORIZONTAL, 128, 1, 0, 256);
  private Scrollbar blueBar = 
    new Scrollbar(Scrollbar.HORIZONTAL, 128, 1, 0, 256);

  // Constructor
  public PickColorFrame(String title) {
    // Set title, background color, and layout
    super(title);
    setBackground(new Color(128, 128, 128));
    setLayout(new GridLayout(6, 1));

    // Create scrollbar listener
    ScrollbarListener listener = new ScrollbarListener();

    // Add red scrollbar and label to frame; attach
    // listener to scrollbar
    add(redBar);
    redBar.addAdjustmentListener(listener);
    add(redLabel);

    // Add green scrollbar and label to frame; attach
    // listener to scrollbar
    add(greenBar);
    greenBar.addAdjustmentListener(listener);
    add(greenLabel);

    // Add blue scrollbar and label to frame; attach
    // listener to scrollbar
    add(blueBar);
    blueBar.addAdjustmentListener(listener);
    add(blueLabel);

    // Attach window listener
    addWindowListener(new WindowCloser());
  }

  // Listener for all scrollbars
  class ScrollbarListener implements AdjustmentListener {
    public void adjustmentValueChanged(AdjustmentEvent evt) {
      int red = redBar.getValue();
      int green = greenBar.getValue();
      int blue = blueBar.getValue();

      redLabel.setText("Red = " + red);
      greenLabel.setText("Green = " + green);
      blueLabel.setText("Blue = " + blue);

      Color newColor = new Color(red, green, blue);
      redLabel.setBackground(newColor);
      greenLabel.setBackground(newColor);
      blueLabel.setBackground(newColor);
    }
  }

  // Listener for window
  class WindowCloser extends WindowAdapter {
    public void windowClosing(WindowEvent evt) {
      System.exit(0);
    }
  }
}
