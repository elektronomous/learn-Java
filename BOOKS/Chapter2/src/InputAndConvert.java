import jpb.*;

public class InputAndConvert {
    public static void main(String[] args) {
        // prompt the user
        System.out.print("Input a decimal number: ");
        String input = SimpleIO.readLine();
        
        double readInput = Convert.toDouble(input);

        System.out.println("The value you've entered: " + readInput);
    }
}