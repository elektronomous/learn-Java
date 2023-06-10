import java.io.IOException;
import java.io.InputStreamReader;

public class StreamReader_2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader keyboard = new InputStreamReader(System.in);      // pass the keyboard to class

        int y = keyboard.read();
        System.out.println(y);      // 魚 =>  39770 (you get the decimal number that represented the character);
                                    //   => convert it to char so you can see the result
        
        char c = (char)y;           // the InputStreamReader converted the bytes into characters form
        System.out.println("The character version: " + c);
    }
}
