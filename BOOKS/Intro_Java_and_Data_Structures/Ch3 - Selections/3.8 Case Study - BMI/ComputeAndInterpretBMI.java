import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt user to enter height in inches
        System.out.print("Enter height in pounds: ");
        double height = input.nextDouble();

        // constant for convert pounds to kilograms
        final double POUNDS_TO_KG = 0.45359237;
        // constant for convert inches to meters
        final double INCHES_TO_METERS = 0.0254;

        // convert the pounds to kg
        weight *= POUNDS_TO_KG;
        // convert the height to meters
        height *= INCHES_TO_METERS;

        // compute the BMI
        double bmi = weight / (height * height);

        // Display the result
        System.out.println("The bmi is " + bmi);

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