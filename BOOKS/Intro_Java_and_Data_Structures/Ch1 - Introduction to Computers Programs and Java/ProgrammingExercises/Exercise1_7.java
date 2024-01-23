/* (Approximate phi) phi can be computed using the following formula:
 *  phi = 4 x (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11))
 * 
 * Write a program that displays the result of 
 *  phi = 4 x (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11))
 * and
 *  phi = 4 x (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + (1/13))
 */

public class Exercise1_7 {
    public static void main(String[] args) {
        System.out.println(4.0 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
        System.out.println(4.0 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));
    }
}