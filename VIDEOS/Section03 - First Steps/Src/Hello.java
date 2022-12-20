public class Hello { 
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // using if-then statement
        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("There's an alien out there.");
            System.out.println("Iam scared with the alien.");
        }

        // using AND logical operator
        int topScore = 80;

        if (topScore < 100) {
            System.out.println("You get the high score.");
        }

        int secondTopScore = 81;

        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than topScore and less than 100");
        }
    }
}