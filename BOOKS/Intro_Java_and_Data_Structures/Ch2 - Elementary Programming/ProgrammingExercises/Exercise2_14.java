import java.util.Scanner;
/*
(Health application: computing BMI) Body Mass Index (BMI) is a measure of 
health on weight. It can be calculated by taking your weight in kilograms and
dividing, by the square of your height in meters. Write a program that prompts the user to 
enter a weight in pounds and height in inches and displays the BMI. Note one pound 
is 0.45359237 kilograms and one inch is 0.0254 meters. Here is a sample run: 

Enter weight in pounds: 95.5
Enter height in inches: 50
BMI is 26.8573
*/

public class Exercise2_14 {
    public static void main(String[] args) {
        // Create a Scanner object to read variable
        Scanner input = new Scanner(System.in);

        // We need to convert pounds to kilograms
        final double POUNDSTOKILOGRAMS = 0.45359237;
        // and inch to meters
        final double INCHTOMETERS = 0.0254;

        // Prompt user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        // and his height
        System.out.print("Enter the height in inch: ");
        double height = input.nextDouble();

        // Compute the BMI
        // first convert the weight into kilo
        weight *= POUNDSTOKILOGRAMS;
        // then height to meters
        height *= INCHTOMETERS;

        // and the BMI itself
        double BMI = weight / Math.pow(height, 2);

        // Display only 2 digits after the decimal point
        BMI = ((int)(BMI * 100) / 100.0);

        // Display the result
        System.out.println("The BMI is " + BMI);

        input.close();
    }
}
