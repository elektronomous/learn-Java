/* fix this code:
 *      int newValue = 50;
 *      if (newValue = 50) {
 *          System.out.println("This is an error");
 *      }
 */

public class Challenge9 {
    public static void main(String[] args) {
        int newValue = 50;

        if (newValue == 50) {
            System.out.println("This is an error");
        }
    }
}
