import jpb.*;

public class Project_5 {
    public static void main(String[] args) {
        System.out.println("This program calculates the day of the week for any date.");

        // month
        System.out.print("Enter month(1 - 12): ");
        short month = Short.parseShort(SimpleIO.readLine());
    
        // date
        System.out.print("Enter day(1 - 31): ");
        short day = Short.parseShort(SimpleIO.readLine());
        // year
        System.out.print("Enter year: ");
        short year = Short.parseShort(SimpleIO.readLine());

        // show the day of the week
        /* using the zeller's conruence:
            J is the century (the first 2-digit of the year)
            K is the year within the century (the last 2-digit of the year)
            m is the month
            q is the day of the month
        
            Note: Zeller's congruence assumes that January and February are treated
                  as months 13 and 14 of the previous year
        */
        final int J = year / 100;
        final int K = year % 100;
        
        int dayOfWeek = (day + ((26 * (month + 1))/10) + K + (K/4) + (J/4) + (5*J)) % 7;
        
        System.out.println("The day of the week is " + dayOfWeek + " (1 = Sunday; 7 = Saturday)");
    }
}