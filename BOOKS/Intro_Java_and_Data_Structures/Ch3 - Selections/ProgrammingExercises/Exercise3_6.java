import java.util.Scanner;
/*
(Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
let the user enter weight, feet, and inches. For example, if a person is 5 feet and
10 inches, you will enter 5 for feet and 10 for inches. Here is a sample run:
    
    Enter weight in pounds: 140
    Enter feet: 5
    Enter inches: 10
    BMI is 20.087702275404553
    Normal

*/

public class Exercise3_6 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        // Prompt user to enter height in feet and inches
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        // Prompt user to enter height in 10
        System.out.print("Enter inches: ");
        double height = input.nextDouble();

        // constant conversion
        final double ONEFEETTOINCHES = 12;
        final double ONEINCHETOMETERS = 0.0254;
        final double ONEPOUNDTOKILOGRAMS = 0.45359237;
        
        // Convert the feet to inches
        double inches = feet * ONEFEETTOINCHES;
        height += inches;
        // Convert the height to meters
        height *= ONEINCHETOMETERS;

        // convert the weight to kilograms
        weight *= ONEPOUNDTOKILOGRAMS;

        // Compute BMI
        double bmi = weight / (height * height);

        System.out.println("The BMI is " + bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

        input.close();
    }
}