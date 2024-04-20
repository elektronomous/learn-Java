/* (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour,
 * 40 minutes and 35 seconds. Write a program that displays the average speed
 * in kilometers per hour. (Note 1 mile is equal to 1.6 kilometers)
 * 
 * 24 miles = n kilometers
 * 24 miles * 1.6 = 38,4 kilometers
 * 
 * 1 minute = 60 seconds
 * n minutes = 35 seconds
 * n minutes = 35 / 60 = 0,58 minutes
 * 
 * 1 hour = 60 minutes
 * n hour = 45,58 minutes
 * n hour = 45,58 / 60 minutes = 0,76 hour
 * 
 * so total hour we get = 1,76 hour
 */

public class Exercise1_12 {
    public static void main(String[] args) {
        System.out.print("The average speed: ");
        System.out.print(38.4 / 1.76);
        System.out.println(" km/hr");
    }
}