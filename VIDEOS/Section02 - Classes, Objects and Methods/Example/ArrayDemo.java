public class ArrayDemo {
    public static void main(/* This is an array of string */String[] args) {
        System.out.println(args.length);
        /* 
         * = when the main method has a parameter, then it will accept the input from the command line
         * = the input always a string,
         * 
         *     $ java ArrayDemo orange
         *      1
         * 
         * 
         * = The input is after your program name
         * = You've just enter one string
         * = You could also enter a collection of input, which store to the array of string.
         *  
         *     $ java ArrayDemo orange apple for example
         *      4
         * 
         * = This the collection of string
         * = You could also access the value of the array by using index operator [n]
         * = The n should be a number where the value is indexed  
         */
        // System.out.println(args[0]);        // access the first array => grapes
        /*
         *      $ java ArrayDemo grapes apple pinneaple
         *      3
         *      grapes
         */
        
        // you could also create a array of integer
        int[] nums = {1, 2, 3, 4, 5, 6};
        /*
         * = When initializing an array, you need to use the angle brackets {}
         * = The compiler will give you a warning if you access the beyond the length of the array
         *   - Make sure you run this program by enter some input, because the line 23 would access
         *     empty array if you dont enter one.
         */
        System.out.println(nums.length);    // get the length of the array => 6
        System.out.println(nums[2]);        // access the first array => 3

        
    }
}
