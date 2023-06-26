import jpb.*;

public class DayOfWeek {
    public static void main(String[] args) {
        // Welcome user
        System.out.println("This program calculates the day of the week for any date.");
        
        // ask the month
        SimpleIO.prompt("Enter month (1-12): ");
        int month = Integer.parseInt(SimpleIO.readLine());

        // ask the day (1-31)
        SimpleIO.prompt("Enter day (1-31): ");
        int day = Integer.parseInt(SimpleIO.readLine());

        // ask the year
        SimpleIO.prompt("Enter a year: ");
        int year = Integer.parseInt(SimpleIO.readLine());
        
        // We're going to use Zeller congruence to guess the day of the week
        // first we need to know the century
        final int century = Math.round(year / 100);
        System.out.println(century);
        // to get the last two digits of the year, we use mod
        year %= 100;
        System.out.println(year);

        
        // the formula is
        long dayOfWeek = (day + (26 * (month+1) / 10) + year + (year/4) + (century/4) + (5 * century)) % 7;
        System.out.println("Assume that 0 = Saturday, 6 = Friday");
        System.out.println("The day of the week: " + dayOfWeek);

    }    
}
