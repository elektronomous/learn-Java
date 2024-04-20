import java.util.Scanner;
/*
(Cost of driving) Write a program that prompts the user to enter the distance to 
drive, the fuel efficiency of the car in miles per gallon, and the price per gallon 
then displays the cost of the trip. Here is a sample run:

Enter the driving distance: 900.5
Enter miles per gallon: 25.5
Enter price per gallon: 3.55
The cost of driving is $125.36
*/

public class Exercise2_23 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the distance to driving
        System.out.print("Enter the driving distance: ");
        double drivingDistance = input.nextDouble();

        // Prompt user to enter how many one galon can go
        System.out.print("Enter miles per galon: ");
        double gallonPerMiles = input.nextDouble();

        // Prompt user to enter price of a gallong
        System.out.print("Enter the price of the gallon: ");
        double priceGallon = input.nextDouble();

        // Compute the cost of driving is:
        double costDriving = (drivingDistance/gallonPerMiles) * priceGallon;
        // Show only 2 digit decimal
        costDriving = ((int)(costDriving*100))/100.0;

        // Display the result
        System.out.println("The cost of driving is $" + costDriving);

        input.close();
    }    
}