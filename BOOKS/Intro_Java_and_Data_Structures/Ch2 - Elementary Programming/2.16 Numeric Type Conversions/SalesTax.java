import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        // The sales tax is 6%
        double tax = purchaseAmount * 0.06;
        System.out.println("Salex tax is $" + (int)(tax * 100)/100.0);

        input.close();
    }
}