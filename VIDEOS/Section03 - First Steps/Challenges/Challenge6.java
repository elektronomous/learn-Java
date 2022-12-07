/* Create two variables in JShell
 * 1 - One variable called mySecondNumber, which is an int, with a value of 12.
 * 2 - Another variable called myThirdNumber, also of type int, with a value of 6.
 */

 public class Challenge6 {
    public static void main(String[] args) {
        int myFirstNumber = (10 + 5) + (2 * 10),
            mySecondNumber = 12,
            myThirdNumber = 6;
        
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("The total value: " + myTotal);
    }
 }