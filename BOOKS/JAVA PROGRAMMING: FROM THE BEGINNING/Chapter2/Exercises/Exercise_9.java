public class Exercise_9 {
    public static void main(String[] args) {
        int d1 = 11;
        int d4 = d1 % 2;

        d1 /= 2;
        
        int d3 = d1 % 2;
        
        d1 /= 2;

        int d2 = d1 % 2;

        d1 /= 2;

        System.out.println("Answer: " + d1 + d2 + d3 + d4);
    }
}

/* What is the output of the following above program?
 * 
 *  = "Answer: 1011"
 * 
 * 
 * 
 */
