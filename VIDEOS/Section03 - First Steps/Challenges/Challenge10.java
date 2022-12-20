/* 1 - Create a double varaible with a value of 20.00
 * 2 - Create a second varaible of type double with a value 80.00
 * 3 - Add both numbers together, then multiply by 100.00
 * 4 - Use the reminder operator, to figure out what the remainder from the result of
 *   - the operation in step three and 40.00, will be.
 * 5 - Create a boolean variable that assigns the value true, if the reminder in step 4-
 *   - is 0.00 or false if it's not zero
 * 6 - Output the boolean variable just to see what the result is
 * 7 - Write an if-then statement that displays a message, 'got some remainder', if the 
 *   - boolean in step five is not true.
 */

public class Challenge10 {
    public static void main(String[] args) {
        // 1
        double var1 = 20.00d;
        // 2
        double var2 = 80.00d;
        // 3
        double totalVar = (var1 + var2) * 100;
        // 4
        double remainder = totalVar % 40;
        // 5
        boolean isZero = (remainder != 0 || remainder != 0.0) ? true : false;
        // 6
        System.out.println("the remainder result: " + isZero);
        // 7
        if (isZero) {
            System.out.println("Got some remainder.");
        }

    }
}
