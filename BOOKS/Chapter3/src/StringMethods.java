public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Fat Cat", str2;
        char ch;
        int index;

        // charAt
        System.out.println("charAt");
        ch = str1.charAt(0);    // => F
        System.out.println(ch);

        ch = str1.charAt(6);    // => t
        System.out.println(ch);

        // indexOf
        System.out.println("indexOf");
        index = str1.indexOf("at");     // => 1
        System.out.println(index);
        index = str1.indexOf("at", index + 1);  // => 5
        System.out.println(index);

        // lastIndexOf
        System.out.println("lastIndexOf");
        index = str1.lastIndexOf("at");     // => 5
        System.out.println(index);
        index = str1.lastIndexOf("at", index-1);    // => 1
        System.out.println(index);

        // length
        System.out.println("length");
        int length = str1.length();     // => 7
        System.out.println(length);

        // substring => String Object
        System.out.println("substring");
        str2 = str1.substring(4);   // str2 => Cat
        System.out.println(str2);
        str2 = str1.substring(0, 3);    // str2 => Fat
        System.out.println(str2);

        // toLowerCase => String Object
        System.out.println("toLowerCase");
        str2 = str1.toLowerCase();  // str2 => "fat cat"
        System.out.println(str2);
        
        // toUpperCase => String Object
        System.out.println("toUpperCase");
        str2 = str1.toUpperCase();  // str2 => "FAT CAT"
        System.out.println(str2);

        // trim => String Object
        System.out.println(str1);
        str1 = " how ";
        str2 = str1.trim();     // str2 => "how";
        System.out.println(str2);

        // Chaining methods
        str2 = str1.trim();         // Trim
        str2 = str2.toLowerCase();  // Convert str2 to lowercase
        System.out.println(str2);

        // concat
        str2 = str2.concat(" do you do?");     // str2 => "how do you do?";
        // or you can str2 + " do you do?"
        System.out.println(str2);

        System.out.println("Using Compound assignment +=");
        String str = "The quick brown fox ";
        System.out.println(str);
        
        // using compound assignment +=
        str += "jump over ";
        str += "the lazy dog";
        System.out.println(str);
        
        // convert int to String
        System.out.println("Convert int to String");
        System.out.println(5 + "");



    }
}