package CodeGym.Task.Task02;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        //write your code here
        Scanner keyboard = new Scanner(System.in);
        String line1 = keyboard.nextLine(),
               line2 = keyboard.nextLine(),
               line3 = keyboard.nextLine();
        
        System.out.println(line3);
        System.out.println(line2.toUpperCase());
        System.out.println(line1.toLowerCase());
    }
}
