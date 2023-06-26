//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// SSNInfo.java (Chapter 4, page 166)                       //
//////////////////////////////////////////////////////////////

// Program name: SSNInfo
// Author: K. N. King
// Written: 1999-06-18
//
// Prompts the user to enter a Social Security number and
// then displays the location (state or territory) where the
// number was issued. The input is checked for length (should
// be 11 characters) and for dashes in the proper places. If
// the input is not valid, the user is asked to re-enter the
// Social Security number.

import jpb.*;

public class SSNInfo {
  public static void main(String[] args) {
    // Prompt the user to enter an SSN and trim the input
    SimpleIO.prompt("Enter a Social Security number: ");
    String ssn = SimpleIO.readLine().trim();

    // If the input isn't 11 characters long, or lacks dashes
    // in the proper places, prompt the user to re-enter
    // the SSN; repeat until the input is valid.
    while (true) {
      if (ssn.length() != 11) {
        System.out.println("Error: Number must have 11 " +
                           "characters");
      } else if (ssn.charAt(3) != '-' || 
                 ssn.charAt(6) != '-') {
        System.out.println(
          "Error: Number must have the form ddd-dd-dddd");
      } else
        break;
      SimpleIO.prompt("\nPlease re-enter number: ");
      ssn = SimpleIO.readLine().trim();
    }

    // Get the area number (the first 3 digits of the SSN)
    int area = Integer.parseInt(ssn.substring(0, 3));

    // Determine the location corresponding to the area number
    String location;
    if      (area == 0)   location = null;
    else if (area <= 3)   location = "New Hampshire";
    else if (area <= 7)   location = "Maine";
    else if (area <= 9)   location = "Vermont";
    else if (area <= 34)  location = "Massachusetts";
    else if (area <= 39)  location = "Rhode Island";
    else if (area <= 49)  location = "Connecticut";
    else if (area <= 134) location = "New York";
    else if (area <= 158) location = "New Jersey";
    else if (area <= 211) location = "Pennsylvania";
    else if (area <= 220) location = "Maryland";
    else if (area <= 222) location = "Delaware";    
    else if (area <= 231) location = "Virginia";    
    else if (area <= 236) location = "West Virginia";    
    else if (area <= 246) location = "North Carolina";    
    else if (area <= 251) location = "South Carolina";   
    else if (area <= 260) location = "Georgia";    
    else if (area <= 267) location = "Florida";    
    else if (area <= 302) location = "Ohio";    
    else if (area <= 317) location = "Indiana";    
    else if (area <= 361) location = "Illinois";   
    else if (area <= 386) location = "Michigan";    
    else if (area <= 399) location = "Wisconsin";   
    else if (area <= 407) location = "Kentucky";
    else if (area <= 415) location = "Tennessee";
    else if (area <= 424) location = "Alabama";
    else if (area <= 428) location = "Mississippi";
    else if (area <= 432) location = "Arkansas";
    else if (area <= 439) location = "Louisiana";
    else if (area <= 448) location = "Oklahoma";
    else if (area <= 467) location = "Texas";
    else if (area <= 477) location = "Minnesota";
    else if (area <= 485) location = "Iowa";
    else if (area <= 500) location = "Missouri";
    else if (area <= 502) location = "North Dakota";
    else if (area <= 504) location = "South Dakota";
    else if (area <= 508) location = "Nebraska";
    else if (area <= 515) location = "Kansas";
    else if (area <= 517) location = "Montana";
    else if (area <= 519) location = "Idaho";
    else if (area <= 520) location = "Wyoming";
    else if (area <= 524) location = "Colorado";
    else if (area <= 525) location = "New Mexico";
    else if (area <= 527) location = "Arizona";
    else if (area <= 529) location = "Utah";
    else if (area <= 530) location = "Nevada";
    else if (area <= 539) location = "Washington";
    else if (area <= 544) location = "Oregon";
    else if (area <= 573) location = "California";
    else if (area <= 574) location = "Alaska";
    else if (area <= 576) location = "Hawaii";
    else if (area <= 579) location = "District of Columbia";
    else if (area <= 580) location = "Virgin Islands";
    else if (area <= 584) location = "Puerto Rico";
    else if (area <= 585) location = "New Mexico";
    else if (area <= 586) location = "Pacific Islands";
    else if (area <= 588) location = "Mississippi";
    else if (area <= 595) location = "Florida";
    else if (area <= 599) location = "Puerto Rico";
    else if (area <= 601) location = "Arizona";
    else if (area <= 626) location = "California";
    else if (area <= 645) location = "Texas";
    else if (area <= 647) location = "Utah";
    else if (area <= 649) location = "New Mexico";
    else if (area <= 653) location = "Colorado";
    else if (area <= 658) location = "South Carolina";
    else if (area <= 665) location = "Louisiana";
    else if (area <= 675) location = "Georgia";
    else if (area <= 679) location = "Arkansas";
    else if (area <= 680) location = "Nevada";
    else                  location = null;

    // Print the location, or print an error message if the
    // area number isn't legal
    if (location != null)
      System.out.println("Number was issued in " + location);
    else
      System.out.println("Number is invalid");
  }
}
