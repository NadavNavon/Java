public class Main {

    public static void main(String[] args) {

        System.out.println("\nThis is a program that checks if it is worth to buy vegetables in the supermarket" +
                " or grow them by yourself\n");

        System.out.println("Let's start with cucumbers:");

        //Cucumber Garden
        System.out.println("First of all, from the garden:");
        VegtableGraden cucumbersGarden = new VegtableGraden();
        cucumbersGarden.VegtableTotal();


        float cucumberGardenWeight = cucumbersGarden.weight;

        //Cucumber Market
        System.out.println("Now, let's move on to the market:");

        VegetablesMarket cucumbersMarket = new VegetablesMarket();
        cucumbersMarket.MarketTotal(cucumberGardenWeight);

        //Cucumber Comparison
        float cucumberGardenPrice = cucumbersGarden.perKilo;
        float cucumberMarketPrice = cucumbersMarket.price;

        Comparison comparisonBoth = new Comparison();
        comparisonBoth.comparison(cucumberMarketPrice, cucumberGardenPrice);



//        System.out.println("Let's move to the tomatoes:");
//        VegtableGraden tomatoes = new VegtableGraden();
//        tomatoes.VegtableTotal();

//        System.out.println("And now the carrots:");
//        VegtableGraden carrots = new VegtableGraden();
//        carrots.VegtableTotal();






    }
}
