//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// ConvertTemp.java (Chapter 12, page 522)                  //
//////////////////////////////////////////////////////////////

// Converts a Fahrenheit temperature entered by the user to
// Celsius, or vice versa

import java.awt.*;
import java.awt.event.*;
import jpb.*;

// Driver class
public class ConvertTemp {
  public static void main(String[] args) {
    Frame frame = 
      new ConvertTempFrame("Temperature Conversion");
    frame.setSize(150, 75);
    frame.setVisible(true);
  }
}

// Frame class
class ConvertTempFrame extends Frame {
  private TextField fahrenField = new TextField();
  private TextField celsiusField = new TextField();

  // Constructor
  public ConvertTempFrame(String title) {
    // Set title for frame and choose layout
    super(title);
    setLayout(new GridLayout(2, 2));

    // Add Fahrenheit label and text field to frame; attach
    // listener to text field
    add(new Label("Fahrenheit"));
    add(fahrenField);
    fahrenField.addActionListener(new FahrenheitListener());

    // Add Celsius label and text field to frame; attach
    // listener to text field
    add(new Label("Celsius"));
    add(celsiusField);
    celsiusField.addActionListener(new CelsiusListener());

    // Attach window listener
    addWindowListener(new WindowCloser());
  }

  // Listener for fahrenField
  class FahrenheitListener implements ActionListener {
    public void actionPerformed(ActionEvent evt) {
      String fahrenheitString = fahrenField.getText();
      double fahrenheit = Convert.toDouble(fahrenheitString);
      double celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
      celsius = Math.rint(celsius * 100.0) / 100.0;
      celsiusField.setText(celsius + "");
    }
  }

  // Listener for celsiusField
  class CelsiusListener implements ActionListener {
    public void actionPerformed(ActionEvent evt) {
      String celsiusString = celsiusField.getText();
      double celsius = Convert.toDouble(celsiusString);
      double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
      fahrenheit = Math.rint(fahrenheit * 100.0) / 100.0;
      fahrenField.setText(fahrenheit + "");
    }
  }

  // Listener for window
  class WindowCloser extends WindowAdapter {
    public void windowClosing(WindowEvent evt) {
      System.exit(0);
    }
  }
}
