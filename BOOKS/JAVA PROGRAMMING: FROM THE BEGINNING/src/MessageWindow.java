//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// MessageWindow.java (Chapter 6, page 244)                 //
//////////////////////////////////////////////////////////////

// Program name: MessageWindow
// Author: K. N. King
// Written: 1999-04-04
//
// Displays a message within a frame. Prompts the user to
// enter a font name and size, the number of lines in the
// message, and the message to be displayed. Spaces are
// allowed before and after each input item.
//
// Once input is complete, a frame labeled "Message Window"
// will appear. The message will be displayed in blue against
// a white background, with the lines of the message centered
// within the frame. The size of the frame will depend
// on the message and the font. The distance between the
// baselines of consecutive lines will match the font's
// height. The distance from the top of the graphics context
// to the baseline of the first line will be the font's ascent
// plus its leading. The space below the last line's baseline
// will be equal to the font's descent. The amount of
// horizontal space on either side of the widest line will
// also match the font's descent.

import java.awt.*;
import jpb.*;

public class MessageWindow {
  public static void main(String[] args) {
    // Prompt user to enter font name
    SimpleIO.prompt("Enter font name: ");
    String fontName = SimpleIO.readLine().trim();

    // Prompt user to enter font size; convert to integer form
    SimpleIO.prompt("Enter font size: ");
    String fontSizeString = SimpleIO.readLine().trim();
    int fontSize = Integer.parseInt(fontSizeString);

    // Create drawable frame and font objects;
    // obtain font metrics
    DrawableFrame df = new DrawableFrame("Message Window");
    Font f = new Font(fontName, Font.PLAIN, fontSize);
    FontMetrics fm = df.getFontMetrics(f);

    // Prompt user to enter number of lines in message;
    // convert to integer form
    SimpleIO.prompt("Enter number of lines in message: ");
    String numLinesString = SimpleIO.readLine().trim();
    int numLines = Integer.parseInt(numLinesString);

    // Read and store lines in message, computing width of
    // widest line
    String[] lines = new String[numLines];
    int maxLineWidth = 0;
    for (int i = 0; i < numLines; i++) {
      // Prompt user to enter a line; store it in array
      SimpleIO.prompt("Enter line " + (i + 1) + ": ");
      lines[i] = SimpleIO.readLine().trim();

      // Compare width of line with maximum width read so
      // far, replacing maximum width if necessary.
      int lineWidth = fm.stringWidth(lines[i]);
      if (lineWidth > maxLineWidth)
        maxLineWidth = lineWidth;
    }

    // Open frame and set its size
    df.show();
    int borderSize = fm.getDescent();
    int height = fm.getHeight();
    df.setSize(maxLineWidth + borderSize * 2,
               numLines * height + fm.getLeading());

    // Obtain graphics context; set drawing color and font
    Graphics g = df.getGraphicsContext();
    g.setColor(Color.blue);
    g.setFont(f);

    // Display lines in message
    int firstBaseline = fm.getLeading() + fm.getAscent();
    for (int i = 0; i < numLines; i++) { 
      int lineWidth = fm.stringWidth(lines[i]);
      g.drawString(lines[i],
                   borderSize + (maxLineWidth - lineWidth) / 2,
                   firstBaseline + i * height);
    }

    // Repaint frame
    df.repaint();
  }
}
