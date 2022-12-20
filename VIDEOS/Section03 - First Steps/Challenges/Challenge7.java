/* 1 - Create a new variable and call it myLastOne
 *   - Its data type should be int
 *   - It should be set to the value of 1000, minus(or less than) the value in the myTotal
 *     of Challenge6.java
 * 2 - Print out the value of the myLastOne variable on the line after you declare it
 */

public class Challenge7 {
    public static void main(String[] args) {
        // Code inside the Challange6.Java
        int myFirstNumber = (10 + 5) + (2 * 10),
            mySecondNumber = 12,
            myThirdNumber = 6;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        // 1
        int myLastOne = 1_000 - myTotal;
        System.out.println("The value of myLastOne: " + myLastOne);
    }
}
