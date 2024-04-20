import java.util.Scanner;
/*
(Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display
the future day of the week. Here is a sample run:

Enter today’s day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday

Enter today’s day: 0
Enter the number of days elapsed since today: 31
Today is Sunday and the future day is Wednesday

sunday = 0
monday = 1
tuesday = 2
wednesday = 3
thursday = 4
friday = 5
saturday = 6

 
*/

public class Exercise3_5 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter today's day
        System.out.println("0: Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday");
        System.out.println("4 = Thursday, 5 = Friday, 6 = Saturday");
        System.out.print("Enter today's day: ");
        int day = input.nextInt();

        // Prompt user to enter the numbero days since today:
        System.out.print("Enter the number of days since today: ");
        int numberOfdays = input.nextInt();

        switch (day + (numberOfdays % 7)) {
            case 0: System.out.println("Today is " + day + " and the future day is Sunday"); 
                    break;
            case 1: System.out.println("Today is " + day + " and the future day is Monday"); 
                    break;
            case 2: System.out.println("Today is " + day + " and the future day is Tuesday"); 
                    break;
            case 3: System.out.println("Today is " + day + " and the future day is Wednesday"); 
                    break;
            case 4: System.out.println("Today is " + day + " and the future day is Thursday"); 
                    break;
            case 5: System.out.println("Today is " + day + " and the future day is Friday"); 
                    break;
            case 6: System.out.println("Today is " + day + " and the future day is Saturday"); 
                    break;
        }

        input.close();
    }
}
