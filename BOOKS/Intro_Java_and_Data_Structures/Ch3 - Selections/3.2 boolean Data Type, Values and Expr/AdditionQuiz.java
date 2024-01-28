import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        // generate number 1
        int number1 = (int)(System.currentTimeMillis() % 10);
        // generate number 2
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);

        // Createt a Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the first-grader to answer the question
        System.out.print("What is " + number1 + " + " + number2 + "?");
        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " +
                           (number1 + number2 == answer));
        input.close();
    }
}