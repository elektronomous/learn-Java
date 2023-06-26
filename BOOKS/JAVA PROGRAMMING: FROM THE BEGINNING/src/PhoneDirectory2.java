//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// PhoneDirectory2.java (Chapter 14, page 642)              //
//////////////////////////////////////////////////////////////

// Program name: PhoneDirectory2
// Author: K. N. King
// Written: 1999-12-22
//
// Stores names and telephone numbers and allows phone
// numbers to be looked up. The user is given a menu of
// three commands:
//
//   a - Add a new phone number
//   f - Find a phone number
//   q - Quit
//
// The "a" command prompts the user to enter a name and a
// number, which are then stored in the program's database.
//
// The "f" command prompts the user to enter a name; the
// program then displays all matching names in the database,
// along with the corresponding phone numbers. It is not
// necessary to enter the entire name; all names that begin
// with the specified characters will be displayed. The "f"
// command ignores the case of letters when looking for
// matching names.
//
// The "q" command causes the program to terminate. The names
// and numbers are saved in a file named "records.dat". When
// the program is run the next time, it will open the file
// and read the records.

import java.io.*;
import java.util.*;
import jpb.*;

public class PhoneDirectory2 {
  // Class variables
  private static final String DATA_FILE = "records.dat";
  private static Vector records;

  public static void main(String[] args) {
    // Read records from data file
    readRecords();

    // Display list of commands
    System.out.println("Phone directory commands:\n" +
                       "  a - Add a new phone number\n" +
                       "  f - Find a phone number\n" +
                       "  q - Quit\n");

    // Read and execute commands
    while (true) {

      // Prompt user to enter a command
      SimpleIO.prompt("Enter command (a, f, or q): ");
      String command = SimpleIO.readLine().trim();
       
      // Determine whether command is "a", "f", "q", or
      // illegal; execute command if legal.
      if (command.equalsIgnoreCase("a")) {

        // Command is "a". Call addNumber to add a new
        // name and number to the database
        addNumber();
      } else if (command.equalsIgnoreCase("f")) {

        // Command is "f". Call findNumber to find phone
        // numbers that match the user's criteria.
        findNumber();
      } else if (command.equalsIgnoreCase("q")) {

        // Command is "q". Save records in data file and
        // terminate program.
        saveRecords();
        return;
      } else {

        // Command is illegal. Display error message.
        System.out.println("Command was not recognized; " +
                           "please enter only a, f, or q.");
      }

      System.out.println();
    }
  }

  ///////////////////////////////////////////////////////////
  // NAME:       addNumber
  // BEHAVIOR:   Prompts the user for a name and number,
  //             then creates a phone record and stores it in
  //             the records vector.
  // PARAMETERS: None
  // RETURNS:    Nothing
  ///////////////////////////////////////////////////////////
  private static void addNumber() {
    SimpleIO.prompt("Enter new name: ");
    String name = SimpleIO.readLine().trim();
    SimpleIO.prompt("Enter new phone number: ");
    String number = SimpleIO.readLine().trim();
    records.addElement(new PhoneRecord(name, number));
  }

  ///////////////////////////////////////////////////////////
  // NAME:       findNumber
  // BEHAVIOR:   Prompts the user for a search key. Searches
  //             the records vector for records whose names
  //             begin with the search key. Prints these
  //             names and the corresponding phone numbers.
  // PARAMETERS: None
  // RETURNS:    Nothing
  ///////////////////////////////////////////////////////////
  private static void findNumber() {
    SimpleIO.prompt("Enter name to look up: ");
    String key = SimpleIO.readLine().trim().toLowerCase();
    for (int i = 0; i < records.size(); i++) {
      PhoneRecord currentRecord =
        (PhoneRecord) records.elementAt(i);
      String name = currentRecord.getName().toLowerCase();
      if (name.startsWith(key))
        System.out.println(currentRecord.getName() + " " +
                           currentRecord.getNumber());
    }
  }

  ///////////////////////////////////////////////////////////
  // NAME:       readRecords
  // BEHAVIOR:   Restores the records vector to its previous
  //             state by reading it (as a single object)
  //             from the data file. Creates an empty vector
  //             if the file does not exist or cannot be
  //             read.
  // PARAMETERS: None
  // RETURNS:    Nothing
  ///////////////////////////////////////////////////////////
  private static void readRecords() {
    try {
      FileInputStream fileIn = new FileInputStream(DATA_FILE);
      ObjectInputStream in = new ObjectInputStream(fileIn);
      records = (Vector) in.readObject();
      in.close();
    } catch (Exception e) {
      System.out.println(DATA_FILE + " does not exist or " +
                         "cannot be read\n");
      records = new Vector();
    }
  }

  ///////////////////////////////////////////////////////////
  // NAME:       saveRecords
  // BEHAVIOR:   Saves the records vector (as a single
  //             object) by writing it to the data file.
  // PARAMETERS: None
  // RETURNS:    Nothing
  ///////////////////////////////////////////////////////////
  private static void saveRecords() {
    try {
      FileOutputStream fileOut =
        new FileOutputStream(DATA_FILE);
      ObjectOutputStream out = 
        new ObjectOutputStream(fileOut);
      out.writeObject(records);
      out.close();
    } catch (IOException e) {
      System.out.println("Error writing to " + DATA_FILE);
    }
  }
}

// Represents a record containing a name and a phone number
class PhoneRecord implements Serializable {
  private String name;
  private String number;
 
  ///////////////////////////////////////////////////////////
  // NAME:       PhoneRecord
  // BEHAVIOR:   Constructs a phone record containing the
  //             specified name and phone number
  // PARAMETERS: personName - name of a person
  //             phoneNumber - phone number for that person
  ///////////////////////////////////////////////////////////
  public PhoneRecord(String personName, String phoneNumber) {
    name = personName;
    number = phoneNumber;
  }

  ///////////////////////////////////////////////////////////
  // NAME:       getName
  // BEHAVIOR:   Returns the name stored in this record
  // PARAMETERS: None
  // RETURNS:    The name stored in this record
  ///////////////////////////////////////////////////////////
  public String getName() {
    return name;
  }
 
  ///////////////////////////////////////////////////////////
  // NAME:       getNumber
  // BEHAVIOR:   Returns the phone number stored in this
  //             record
  // PARAMETERS: None
  // RETURNS:    The phone number stored in this record
  ///////////////////////////////////////////////////////////
  public String getNumber() {
    return number;
  }
}
