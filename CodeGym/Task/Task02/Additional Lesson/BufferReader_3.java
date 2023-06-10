import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader_3 {
    public static void main(String[] args) throws IOException {
        // those two stream(1,2) needs something faster to
        // output their input
        // so we use bufferreader
        BufferedReader fruitCart = new BufferedReader(new InputStreamReader(System.in)); /*🛒 */

        // if you want fruits, you just order it using
        String fruits = fruitCart.readLine();
        System.out.println("Your one fruit: " + fruits);

        // if you want the fruits first character
        char fruitFirstInitial = (char)fruitCart.read();
        System.out.println("Your fruit first initial: " + fruitFirstInitial);
    }
}
