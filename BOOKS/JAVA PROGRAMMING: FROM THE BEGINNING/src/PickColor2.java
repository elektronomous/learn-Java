//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// PickColor2.java (Appendix D, page 755)                   //
//////////////////////////////////////////////////////////////

// Allows the user to pick a color by moving three scrollbars
// (applet version)

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PickColor2 extends Applet {
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

  public void init() {
    // Set background color and layout
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
}
