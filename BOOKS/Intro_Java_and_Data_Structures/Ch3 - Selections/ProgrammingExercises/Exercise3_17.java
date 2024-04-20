/*
(Game: scissor, rock, paper) Write a program that plays the popular scissor–
rock–paper game. (A scissor can cut a paper, a rock can knock a scissor, and
a paper can wrap a rock.) The program randomly generates a number 0, 1, or
2 representing scissor, rock, and paper. The program prompts the user to enter
a number 0, 1, or 2 and displays a message indicating whether the user or the
computer wins, loses, or draws. Here are sample runs:
    
    scissor (0), rock (1), paper (2): 1
    The computer is scissor. You are rock. You won
    scissor (0), rock (1), paper (2): 2
    The computer is paper. You are paper too. It is a draw
*/
import java.util.Scanner;

public class Exercise3_17 { 
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Generate random numbers from 0 - 2
        int computerChoice = (int)(Math.random() * 3);
        
        // Prompt user to enter choice
        System.out.print("scissor (0), rock (1), paper(2): ");
        int userChoice = input.nextInt();
        // Store the status winner
        boolean isWin = false;
        boolean isDraw = false;

        if (userChoice > 2)
            System.out.println("wrong/invalid input");
        else {
            if (userChoice > computerChoice)
                isWin = true;
            else if (userChoice == computerChoice)
                isDraw = true;
            else
                isWin = false;
        }

        if (isWin)
            System.out.println("The computer is " + (computerChoice == 0? "scissor." : (computerChoice == 1? "rock." : "paper.")) +
                               " You are " + (userChoice == 0? "scissor." : (userChoice == 1? "rock." : "paper.")) +
                               " You won");
        else if (isDraw)
            System.out.println("The computer is " + (computerChoice == 0? "scissor." : (computerChoice == 1? "rock." : "paper.")) +
                                " You are " + (userChoice == 0? "scissor." : (userChoice == 1? "rock." : "paper.")) +
                                " It is draw");
        else
            System.out.println("The computer is " + (computerChoice == 0? "scissor." : (computerChoice == 1? "rock." : "paper.")) +
                                " You are " + (userChoice == 0? "scissor." : (userChoice == 1? "rock." : "paper.")) +
                                " You lost");
        input.close();
    }
}