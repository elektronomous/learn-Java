public class Primitives {
    public static void main(String[] args) {
        // how much integer can store a value
        int myIntegerMaximumValue = Integer.MAX_VALUE;
        int myIntegerMinimumValue = Integer.MIN_VALUE;

        System.out.println("Maximum value that integer can store: " + myIntegerMaximumValue);   
        // => 2147483647
        
        System.out.println("Minimum value that integer can store: " + myIntegerMinimumValue);
        // = -2147483648
        
        // What happens when you try to add 1
        // or subtract 1 from the max and min value
        System.out.println("Busted integer maximum value: " + (Integer.MAX_VALUE + 1));     
        // => -2147483648
        
        System.out.println("Busted integer minimum value: " + (Integer.MIN_VALUE - 1));     
        // => 2147483647

        // also we have byte, short, long and width
        byte myByteMaxValue = Byte.MAX_VALUE;
        byte myByteMinValue = Byte.MIN_VALUE;

        System.out.println("Maximum Byte data type: " + myByteMaxValue);
        System.out.println("Minimum Byte data type: " + myByteMinValue);

        // how about short
        short myShortMaxValue = Short.MAX_VALUE;
        short myShortMinValue = Short.MIN_VALUE;

        System.out.println("Maximum Short data type: " + myShortMaxValue);
        System.out.println("Minimum Short data type: " + myShortMinValue);

        // how about long now?
        long myLongMaxValue = Long.MAX_VALUE;
        long myLongMinValue = Long.MIN_VALUE;

        System.out.println("Maximum Long data type: " + myLongMaxValue);
        System.out.println("Minimum Long data type: " + myLongMinValue);

        // if you specify the a value without L, and the value is larger than
        // integer MAX_VALUE, java will keep warning you that the value is overflow

        System.out.println(myByteMinValue / 2);

        byte myNewByteResult = (byte)(myByteMinValue / 2);

        System.out.println("The casting version: " + myNewByteResult);

    }
}
