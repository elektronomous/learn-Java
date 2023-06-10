import java.io.IOException;

public class SystemIn_1 {
    public static void main(String[] args) throws IOException{

        int x = System.in.read();       
        System.out.println(x);      // 魚 =>  233173154 (3 bytes, you get bytes);
        // you use the System.in to get the bytes of the input stream.

    }
}