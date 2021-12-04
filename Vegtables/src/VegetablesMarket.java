import java.util.Scanner;

public class VegetablesMarket {

    // Fields/ states
    float price;
    float totalPriceMarket;

    public void MarketTotal(float kilo){  // Method

        System.out.println("What is the price per kilo in the market?");
        Scanner pricemarket = new Scanner(System.in);
        price = pricemarket.nextFloat();

        totalPriceMarket = price * kilo;

        System.out.println("So, buying the same amount in the supermarket would have cost you " + totalPriceMarket + " NIS");

    };


}
