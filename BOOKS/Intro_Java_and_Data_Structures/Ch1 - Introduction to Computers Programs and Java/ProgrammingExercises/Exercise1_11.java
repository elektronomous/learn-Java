/* (Population projections) The U.S. Census Bureau projects population based
 * on the following assumptions:
 *      (1) One birth every 7 seconds
 *      (2) One death every 13 seconds
 *      (3) One new immigrant every 45 seconds
 * 
 * Write a program to display the population for each of the next five years.
 * Assume that the current population is 312,032,486 and one year has 365 days.
 *      Hint: In Java, if two integers perform division, the result is an integer.
 *            The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25)
 *            and 10 / 4 is 2 (not 2.5). To get an accurate result with the fracti-
 *            onal part, one of the values involved in the division must be a number
 *            with a decimal point. For example 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */

public class Exercise1_11 {
    public static void main(String[] args) {
        /* 5 years = n seconds
         * 5 years = n days = 365 * 5 = 1825 days
         * 1825 days = n hours = 1825 * 24 = 43800 hours
         * 43800 hours = n seconds = 43800 * 3600 = 157,680,000
         */
        System.out.println("One birth every 7 seconds");
        System.out.println("One death every 13 seconds");
        System.out.println("One new immigrant every 45 seconds");
        System.out.print("population = birth - death + new immigrant = ");
        System.out.println((157680000 / 7.0) - (157680000 / 13.0) + (157680000 / 45.0));

    }
}