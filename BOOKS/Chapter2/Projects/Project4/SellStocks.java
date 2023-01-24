import jpb.*;
import java.lang.Math;


public class SellStocks {
    public static void main(String[] args) {
        // Welcome the user
        System.out.println("This program calculates the net proceeds from a sale of stock");

        // prompt the user for the price of one stock
        SimpleIO.prompt("Enter stock price: ");
        // store the price
        double stockPrice = Convert.toDouble(SimpleIO.readLine());
        
        // prompt the user for how many shares it want to proceeds
        SimpleIO.prompt("Enter number of shares: ");
        // store the shares
        int shares = Integer.parseInt(SimpleIO.readLine());

        // calculate the total price
        double totalPrice = stockPrice * shares;
        System.out.println("Value of shares: $" + String.format("%.2f", totalPrice));

        // prompt the user the comission rate the stock it has buy
        SimpleIO.prompt("Enter comission rate (as a percentage): ");
        double comissionRate = Convert.toDouble(SimpleIO.readLine())/100;
        // calculate the comission
        comissionRate *= totalPrice;
        System.out.println("Comission: $" +  String.format("%.2f", comissionRate));

        // calculate the net proccess
        System.out.println("Net proceeds: $" + String.format("%.2f", (totalPrice - comissionRate)));
    }
}
