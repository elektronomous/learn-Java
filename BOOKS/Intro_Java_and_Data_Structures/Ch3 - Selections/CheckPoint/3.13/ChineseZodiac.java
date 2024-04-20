import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();
       
        if ((year %= 12) == 1) {
            System.out.println("rooster");
        } else if ((year %= 12) == 2)
            System.out.println("dog");
        else if ((year %= 12) == 3)
            System.out.println("pig");
        else if ((year %= 12) == 4)
            System.out.println("rat");
        else if ((year %= 12) == 5)
            System.out.println("ox");
        else if ((year %= 12) == 6)
            System.out.println("tiger");
        else if ((year %= 12) == 7)
            System.out.println("rabbit");
        else if ((year %= 12) == 8)
            System.out.println("dragon");
        else if ((year %= 12) == 9)
            System.out.println("snake");
        else if ((year %= 12) == 10)
            System.out.println("horse");
        else if ((year %= 12) == 11)
            System.out.println("sheep");
        else
            System.out.println("monkey");

        input.close();
    }
}