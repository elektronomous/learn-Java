/* 1 - Create a byte variable and set it to any valid byte number
 * 2 - Create a short variable and set it to any valid short number.
 * 3 - Create an int variable and set it to any valid int number.
 * 4 - Create a variable of type long and make it equal to 50000 plus 10 times
 *     then sum of the byte plus the short plus the integer values
 */

public class Challenge5 {
    public static void main(String[] args) {
        // 1
        byte myByte = 10;
        // 2
        short myShort = 20;
        // 3
        int myInt = 30;

        int myResult = myByte + myShort + myInt;
        // 4
        long myLong = 50_000L + (myResult * 10L);

        // print out
        System.out.println("The long result: " + myLong);
    }
    
}
