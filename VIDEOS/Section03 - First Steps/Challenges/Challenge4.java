/* 1 - Create a new variable call myLastOne
 * 2 - We want the value to be 1000 less the current value of myTotal in Challenge3
 * 3 - The data type is an int
 * 4 - Print out the value of myLastOne.
 * 
 */
public class Challenge4 {
    public static void main(String[] args) {
        // 1
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = mySecondNumber + myThirdNumber;
        
        // 2 & 3
        int myLastOne = 1000 - myTotal;

        // 4
        System.out.println(myLastOne);
    }
}
