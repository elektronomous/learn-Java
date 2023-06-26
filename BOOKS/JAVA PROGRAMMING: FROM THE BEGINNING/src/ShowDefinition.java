//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// ShowDefinition.java (Chapter 12, page 525)               //
//////////////////////////////////////////////////////////////

// Shows the definition of a term

import java.awt.*;
import java.awt.event.*;

// Driver class
public class ShowDefinition {
  public static void main(String[] args) {
    Frame f = new ShowDefinitionFrame("Show Definition");
    f.setSize(300, 160);
    f.setVisible(true);
  }
}

// Frame class
class ShowDefinitionFrame extends Frame {
  private List termList = new List();
  private TextArea definitionArea = new TextArea();
  private String[] terms =
    {"Button", "Checkbox", "Choice", "Label",
     "List", "Scrollbar", "TextArea", "TextField"};
  private String[] definitions =
    {"A labeled button that can\nbe pressed",
     "A box that can be clicked\n\"on\" or \"off\"",
     "A menu that displays one\nitem at a time",
     "A string that can be\npositioned next to " +
       "other\ncomponents",
     "A scrolling list of items",
     "A sliding bar that can be\neither horizontal or " +
       "vertical",
     "A multiline area in which\ntext can be displayed " +
       "or\nedited",
     "A single line of text that\ncan be displayed " +
       "or\nedited"};

  // Constructor
  public ShowDefinitionFrame(String title) {
    // Set title for frame
    super(title);

    // Put terms in term list; add term list to frame
    for (int i = 0; i < terms.length; i++)
      termList.add(terms[i]);
    termList.addItemListener(new ListListener());
    add("West", termList);

    // Make definition area not editable and add to frame
    definitionArea.setEditable(false);
    add("Center", definitionArea);

    // Attach window listener
    addWindowListener(new WindowCloser());
  }

  // Listener for termList
  class ListListener implements ItemListener {
    public void itemStateChanged(ItemEvent evt) {
      int index = termList.getSelectedIndex();
      definitionArea.setText(definitions[index]);
    }
  }

  // Listener for window
  class WindowCloser extends WindowAdapter {
    public void windowClosing(WindowEvent evt) {
      System.exit(0);
    }
  }
}
