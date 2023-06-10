import jpb.*;

public class Project_4 {
    public static void main(String[] args) {
        System.out.println("This program calculates the net proceeds from a sale of stock");
        
        // enter stock price
        System.out.print("Enter stock price: ");
        double stockPrice = Convert.toDouble(SimpleIO.readLine());

        // enter number of shares
        System.out.print("Enter number of shares: ");
        int numberOfShares = Integer.parseInt(SimpleIO.readLine());

        // show the values per shares
        double valueOfShares = numberOfShares*stockPrice;
        System.out.println("Value of shares: $" + String.format("%.2f", valueOfShares));
        

        // enter comission rates
        System.out.print("Enter comission rate(as a percentage): ");
        double comissionRate = Convert.toDouble(SimpleIO.readLine());

        // show the comission
        double comissionPrice = (valueOfShares*comissionRate)/100;
        System.out.println("Comission: $" + String.format("%.2f", comissionPrice));

        // show the net proceeds
        System.out.println("Net proceeds: $" + String.format("%.2f",(valueOfShares - comissionPrice)));
    }
}