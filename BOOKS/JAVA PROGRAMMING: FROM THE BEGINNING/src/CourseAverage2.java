//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// CourseAverage2.java (Chapter 7, page 284)                //
//////////////////////////////////////////////////////////////

// Program name: CourseAverage2
// Author: K. N. King
// Written: 1998-04-21
// Modified: 1999-04-18
//
// Prompts the user to enter eight program scores (0-20), five
// quiz scores (0-10), two test scores (0-100), and a final
// exam score (0-100). Scores may contain digits after the
// decimal point. Input is not checked for validity. Displays
// the course average, computed using the following formula:
//
//   Programs    30%
//   Quizzes     10%
//   Test 1      15%
//   Test 2      15%
//   Final exam  30%
//
// The course average is rounded to the nearest integer.

import jpb.*;

public class CourseAverage2 {

  // Constants
  private static final int NUM_PROGRAMS = 8;
  private static final int NUM_QUIZZES = 5;
  private static final int MAX_PROG_SCORE = 20;
  private static final int MAX_QUIZ_SCORE = 10;
  private static final double PROGRAM_WEIGHT = .30;
  private static final double QUIZ_WEIGHT = .10;
  private static final double TEST_WEIGHT = .15;
  private static final double FINAL_EXAM_WEIGHT = .30;

  public static void main(String[] args) {
    // Print the introductory message
    System.out.println("Welcome to the CSc 2310 average " +
                       "calculation program.\n");

    // Prompt the user to enter program scores and compute
    // the average of the scores
    double programAverage = readProgramScores() / NUM_PROGRAMS;

    // Leave a blank line
    System.out.println();

    // Prompt the user to enter quiz scores and compute the
    // average of the scores
    double quizAverage = readQuizScores() / NUM_QUIZZES;

    // Leave a blank line
    System.out.println();

    // Prompt the user to enter scores on the tests and final
    // exam
    double test1 = readDouble("Enter Test 1 score: ");
    double test2 = readDouble("Enter Test 2 score: ");
    double finalExam = readDouble("Enter Final Exam score: ");

    // Compute the course average from the program average,
    // quiz average, test scores, and final exam score
    double courseAverage =
      PROGRAM_WEIGHT * (programAverage / MAX_PROG_SCORE * 100) +
      QUIZ_WEIGHT * (quizAverage / MAX_QUIZ_SCORE * 100) +
      TEST_WEIGHT * test1 +
      TEST_WEIGHT * test2 +
      FINAL_EXAM_WEIGHT * finalExam;

    // Round the course average to the nearest integer and
    // display it
    System.out.println("\nCourse average: " +
                       Math.round(courseAverage));
  }

  ///////////////////////////////////////////////////////////
  // NAME:       readProgramScores
  // BEHAVIOR:   Prompts the user to enter program scores
  //             and computes their total.
  // PARAMETERS: None
  // RETURNS:    Total of program scores
  ///////////////////////////////////////////////////////////
  private static double readProgramScores() {
    double programTotal = 0.0;
    for (int i = 1; i <= NUM_PROGRAMS; i++)
      programTotal += readDouble("Enter Program " + i +
                                 " score: ");
    return programTotal;
  }

  ///////////////////////////////////////////////////////////
  // NAME:       readQuizScores
  // BEHAVIOR:   Prompts the user to enter quiz scores and
  //             computes their total.
  // PARAMETERS: None
  // RETURNS:    Total of quiz scores
  ///////////////////////////////////////////////////////////
  private static double readQuizScores() {
    double quizTotal = 0.0;
    for (int i = 1; i <= NUM_QUIZZES; i++)
      quizTotal += readDouble("Enter Quiz " + i + " score: ");
    return quizTotal;
  }

  ///////////////////////////////////////////////////////////
  // NAME:       readDouble
  // BEHAVIOR:   Prompts the user to enter a number, reads
  //             the user's input, and converts it to double
  //             form.
  // PARAMETERS: prompt - the prompt to be displayed
  // RETURNS:    User's input after conversion to double
  ///////////////////////////////////////////////////////////
  private static double readDouble(String prompt) {
    SimpleIO.prompt(prompt);
    String userInput = SimpleIO.readLine();
    return Convert.toDouble(userInput);
  }
}
