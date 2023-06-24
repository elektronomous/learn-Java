package BOOKS.INTRODUCTION_TO_JAVA_PROGRAMMING_AND_DATA_STRUCTURES.Chapter2.src;

import java.util.Scanner;

public class InputAllNumericTypes {

    public static void main(String[] args) {
        byte byteVal;
        short shortVal;
        int intVal;
        long longVal;

        Scanner input = new Scanner(System.in);

        // read a byte
        byteVal = input.nextByte();
        // read a short
        shortVal = input.nextShort();
        // read an integer
        intVal = input.nextInt();
        // read a long
        longVal = input.nextLong();

        System.out.println("Byte: " + byteVal + '\n' +
                           "Short: " + shortVal + '\n' +
                           "Integer: " + intVal + '\n' +
                           "Long: " + longVal);

        input.close();
    }
}
