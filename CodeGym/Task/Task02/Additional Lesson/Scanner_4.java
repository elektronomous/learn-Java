import java.io.IOException;
import java.util.Scanner;

/*
 * We have an advance IO feature from java called Scanner class
 * it works like the scanner, you provide data(text, a file, the console) and
 * it would store the value you've just scanned.
 */
public class Scanner_4 {
    public static void main(String[] args) throws IOException {
        // create your own scanner
        // with data source is a text
        Scanner scanner = new Scanner("Hello There\n Hello World!");
        String line1 = scanner.nextLine();      // pass the "Hello There" (source data) to your variable
        String line2 = scanner.nextLine();      // pass the "Hello World" to your variable
        System.out.println(line1 + " " + line2);

        // create your own scanner
        // with data source is your keyboard
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();      // will pass your input from keyboard to your name variable
        System.out.println("Your name: " + name);

        // maybe you wanna create a calculator program
        // then you need to read a number instead of string(Line)
        Scanner calculator = new Scanner(System.in);
        // int a = calculator.nextInt();
        int number = 0;

        // but be careful, someone could also enter non-numeric value
        // which make your calculator program crash, terminated by computer
        // so we need to check first the user input
        if (calculator.hasNextInt()) { 
            number = calculator.nextInt();       // pass the number
            System.out.println("Your number: " + number);
        } else
            System.out.println("You've passed the wrong numeric character");
        
        
        // you need to shut your scanner off
        calculator.close();
        keyboard.close();
        scanner.close();
    }
}
