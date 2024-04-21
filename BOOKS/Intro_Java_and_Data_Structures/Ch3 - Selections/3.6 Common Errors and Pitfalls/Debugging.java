public class Debugging {
    public static void main(String[] args) {
        double roundoff_result = 1.0 - 0.9;
        // Display the round off error result
        System.out.println("The round-off error: " + Math.round(roundoff_result));
        // the result should be 0.1

        // What if we multiply this round-off error result with 10
        System.out.println("After multiplied by 10: " + roundoff_result * 10);
        // What if we divided again by 10
        System.out.println("After divided by 10: " + (roundoff_result * 10) / 10);
    }
}