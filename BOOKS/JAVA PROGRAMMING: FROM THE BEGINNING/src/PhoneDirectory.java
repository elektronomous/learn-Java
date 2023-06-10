//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// PhoneDirectory.java (Chapter 5, page 210)                //
//////////////////////////////////////////////////////////////

// Program name: PhoneDirectory
// Author: K. N. King
// Written: 1999-06-22
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
// The "q" command causes the program to terminate. All names
// and numbers are lost.

import jpb.*;

public class PhoneDirectory {
  public static void main(String[] args) {
    PhoneRecord[] records = new PhoneRecord[100];
    int numRecords = 0;

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

        // Command is "a". Prompt user for name and number,
        // then create a phone record and store it in the
        // database.
        if (numRecords < records.length) {
          SimpleIO.prompt("Enter new name: ");
          String name = SimpleIO.readLine().trim();
          SimpleIO.prompt("Enter new phone number: ");
          String number = SimpleIO.readLine().trim();
          records[numRecords] = 
            new PhoneRecord(name, number);
          numRecords++;
        } else
          System.out.println("Database is full");

      } else if (command.equalsIgnoreCase("f")) {

        // Command is "f". Prompt user for search key.
        // Search the database for records whose names begin
        // with the search key. Print these names and the
        // corresponding phone numbers.
        SimpleIO.prompt("Enter name to look up: ");
        String key = SimpleIO.readLine().trim().toLowerCase();
        for (int i = 0; i < numRecords; i++) {
          String name = records[i].getName().toLowerCase();
          if (name.startsWith(key))
            System.out.println(records[i].getName() + " " + 
                               records[i].getNumber());
        }

      } else if (command.equalsIgnoreCase("q")) {
        // Command is "q". Terminate program.
        return;

      } else {
        // Command is illegal. Display error message.
        System.out.println("Command was not recognized; " +
                           "please enter only a, f, or q.");
      }

      System.out.println();
    }
  }
}

// Represents a record containing a name and a phone number
class PhoneRecord {
  private String name;
  private String number;

  // Constructor
  public PhoneRecord(String personName, String phoneNumber) {
    name = personName;                       
    number = phoneNumber;
  }

  // Returns the name stored in the record
  public String getName() {
    return name;
  }
 
  // Returns the phone number stored in the record
  public String getNumber() {
    return number;
  }
}
