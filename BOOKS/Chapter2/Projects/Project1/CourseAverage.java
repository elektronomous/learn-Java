package BOOKS.Chapter2.Projects.Project1;
import BOOKS.Chapter2.Projects.jpb.*;

public class CourseAverage {
    public static void main(String[] args) {
        // Print the introductory message
        System.out.println("Welcome to the CSc 2310 average " +
        "calculation program.\n");

        // Prompt the user to enter eight program scores
        SimpleIO.prompt("Enter Program 1 score: ");
        String userInput = SimpleIO.readLine();
        // double program1 = Convert.toDouble(userInput);
        double programTotal = Convert.toDouble(userInput);


        SimpleIO.prompt("Enter Program 2 score: ");
        userInput = SimpleIO.readLine();
        // double program2 = Convert.toDouble(userInput);
        programTotal += Convert.toDouble(userInput);

        SimpleIO.prompt("Enter Program 3 score: ");
        userInput = SimpleIO.readLine();
        // double program3 = Convert.toDouble(userInput);
        programTotal += Convert.toDouble(userInput);

        SimpleIO.prompt("Enter Program 4 score: ");
        userInput = SimpleIO.readLine();
        // double program4 = Convert.toDouble(userInput);
        programTotal += Convert.toDouble(userInput);

        SimpleIO.prompt("Enter Program 5 score: ");
        userInput = SimpleIO.readLine();
        // double program5 = Convert.toDouble(userInput);
        programTotal += Convert.toDouble(userInput);

        SimpleIO.prompt("Enter Program 6 score: ");
        userInput = SimpleIO.readLine();
        // double program6 = Convert.toDouble(userInput);
        programTotal += Convert.toDouble(userInput);

        SimpleIO.prompt("Enter Program 7 score: ");
        userInput = SimpleIO.readLine();
        // double program7 = Convert.toDouble(userInput);
        programTotal += Convert.toDouble(userInput);

        SimpleIO.prompt("Enter Program 8 score: ");
        userInput = SimpleIO.readLine();
        // double program8 = Convert.toDouble(userInput);
        programTotal += Convert.toDouble(userInput);

        // Compute the program average from the eight scores
        // double programAverage =
        //   (program1 + program2 + program3 + program4 +
        //    program5 + program6 + program7 + program8) / 8;
        double programAverage = programTotal / 8;

        // Prompt the user to enter five quiz scores
        SimpleIO.prompt("\nEnter Quiz 1 score: ");
        userInput = SimpleIO.readLine();
        // double quiz1 = Convert.toDouble(userInput);
        double quizTotal = Convert.toDouble(userInput);

        SimpleIO.prompt("Enter Quiz 2 score: ");
        userInput = SimpleIO.readLine();
        // double quiz2 = Convert.toDouble(userInput);
        quizTotal += Convert.toDouble(userInput);

        SimpleIO.prompt("Enter Quiz 3 score: ");
        userInput = SimpleIO.readLine();
        // double quiz3 = Convert.toDouble(userInput);
        quizTotal += Convert.toDouble(userInput);

        SimpleIO.prompt("Enter Quiz 4 score: ");
        userInput = SimpleIO.readLine();
        // double quiz4 = Convert.toDouble(userInput);
        quizTotal += Convert.toDouble(userInput);

        SimpleIO.prompt("Enter Quiz 5 score: ");
        userInput = SimpleIO.readLine();
        // double quiz5 = Convert.toDouble(userInput);
        quizTotal += Convert.toDouble(userInput);

        // Compute the quiz average from the five scores
        // double quizAverage =
        //   (quiz1 + quiz2 + quiz3 + quiz4 + quiz5) / 5;
        double quizAverage = quizTotal / 5;

        // Prompt the user to enter scores on the tests and final
        // exam
        SimpleIO.prompt("\nEnter Test 1 score: ");
        userInput = SimpleIO.readLine();
        double test1 = Convert.toDouble(userInput);

        SimpleIO.prompt("Enter Test 2 score: ");
        userInput = SimpleIO.readLine();
        double test2 = Convert.toDouble(userInput);

        SimpleIO.prompt("Enter Final Exam score: ");
        userInput = SimpleIO.readLine();
        double finalExam = Convert.toDouble(userInput);

        // Compute the course average from the program average,
        // quiz average, test scores, and final exam score.
        // The program average (0-20) is multiplied by 5 to put
        // it on a scale of 0 to 100. The quiz average (0-10) is
        // multiplied by 10 for the same reason.
        double courseAverage = .30 * programAverage * 5 +
                .10 * quizAverage * 10 +
                .15 * test1 +
                .15 * test2 +
                .30 * finalExam;

        // Round the course average to the nearest integer and
        // display it
        System.out.println("\nCourse average: " +
            Math.round(courseAverage));
    } 
}