package BOOKS.INTRODUCTION_TO_JAVA_PROGRAMMING_AND_DATA_STRUCTURES.Chapter1.Exercises;

public class Exercise_13 {
    public static void main(String[] args) { 
        /* 
            ax + by = e
            cx + dy = f

            x = (ed - bf) / (ad - bc)
            y = (af - ec) / (ad - bc)

            3.4x + 50.2y = 44.5
            2.1x + 0.55y = 5.9
        
        */
        System.out.print("x = ( (44.5 * 0.55) - (50.2 * 5.9)) / ( (3.4 * 0.55) - (50.2 * 2.1)) = ");
        System.out.println(( (44.5 * 0.55) - (50.2 * 5.9)) / ( (3.4 * 0.55) - (50.2 * 2.1)));

        System.out.print("y = ( (3.4 * 5.9) - (2.1 * 44.5) ) / ( (3.4 * 0.55) - (50.2 * 2.1)) = ");
        System.out.println(( (3.4 * 5.9) - (2.1 * 44.5) ) / ( (3.4 * 0.55) - (50.2 * 2.1))) ;
    }
}