//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// AirMileage.java (Chapter 13, page 572)                   //
//////////////////////////////////////////////////////////////

// Determines air mileage from New York to other cities.
// Mileages are from The New York Public Library Desk
// Reference, Second Edition (New York: Prentice-Hall, 1993).

import jpb.*;

public class AirMileage {
  // Names of international cities
  private static final String[] CITY_NAMES =
    {"acapulco",     "amsterdam",  "antigua",
     "aruba",        "athens",     "barbados",
     "bermuda",      "bogota",     "brussels",
     "buenos aires", "caracas",    "copenhagen",
     "curacao",      "frankfurt",  "geneva",
     "glasgow",      "hamburg",    "kingston",
     "lima",         "lisbon",     "london",
     "madrid",       "manchester", "mexico City",
     "milan",        "nassau",     "oslo",
     "paris",        "reykjavik",  "rio de janeiro",
     "rome",         "san juan",   "santo domingo",
     "st. croix",    "tel aviv",   "zurich"};

  // Distances from New York to other cities
  private static final int[] DISTANCES =
    {2260, 3639, 1783, 1963, 4927, 2100,  771, 2487, 3662,
     5302, 2123, 3849, 1993, 3851, 3859, 3211, 3806, 1583,
     3651, 3366, 3456, 3588, 3336, 2086, 4004, 1101, 3671,
     3628, 2600, 4816, 4280, 1609, 1560, 1680, 5672, 3926};

  public static void main(String[] args) {
    // Display initial message
    System.out.println(
      "This program finds the air mileage between\n" +
      "New York and major international cities.\n");

    // Prompt user for city name
    SimpleIO.prompt("Enter city name: ");
    String cityName = SimpleIO.readLine().trim();

    // Use binary search to locate name in CITY_NAMES array
    int i = binarySearch(CITY_NAMES, cityName.toLowerCase());

    // If name was found in array, display distance from New
    // York to chosen city
    if (cityName.equalsIgnoreCase(CITY_NAMES[i]))
      System.out.println(cityName + " is " + DISTANCES[i] +
                         " miles from New York City.");
    else
      System.out.println(cityName + " wasn't found.");
  }

  // Uses the binary search algorithm to locate key in the
  // array a. Returns the index of key if it is found in a.
  private static int binarySearch(String[] a, String key) {
    int low = 0;
    int high = a.length - 1;

    while (low < high) {
      int mid = (low + high) / 2;
      if (a[mid].compareTo(key) < 0)
        low = mid + 1;
      else
        high = mid;
    }
    return low;
  }
}
