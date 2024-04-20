import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 5 == 0)
            System.out.println("HiFive");
        
        if (number % 2 == 0)
            System.out.println("HiEven");

        input.close();
    }
}