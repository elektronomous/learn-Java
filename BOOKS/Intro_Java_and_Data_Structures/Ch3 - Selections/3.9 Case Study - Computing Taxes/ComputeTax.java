import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter filling status
        System.out.println("0 - Single filer");
        System.out.println("1 - Married jointly or qualifying widow(er)");
        System.out.println("2 - Married seperately");
        System.out.println("3 - Head of household");
        System.out.print("Enter the filling status: ");
        int status = input.nextInt();

        // Prompt user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        // Compute tax
        double tax = 0;

        if (status == 0) {
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
                      (income - 82250) * 0.28;
            else if (income <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
                      (372950 - 82250) * 0.28 + (income - 372950) * 0.35;
        } else if (status == 1) {
            if (income <= 16700)
                tax = income * 0.10;
            else if (income <= 67900)
                tax = 16700 * 0.10 + (income - 16700) * 0.15;
            else if (income <= 137050)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
            else if (income <= 171550)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 +
                    (income - 137050) * 0.28;
            else if (income <= 372950)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 +
                    (372950 - 137050) * 0.28 + (income - 372950) * 0.35;
        }
    }
}