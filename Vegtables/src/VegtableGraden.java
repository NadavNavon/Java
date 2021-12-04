import java.util.Scanner;

public class VegtableGraden {

        // Creating fields / states
        float sum;
        int[] vegCount = new int[4];
        float priceSeeds;
        float weight;
        float perVeg;
        float perKilo;

    public void VegtableTotal() {   // Creating a method

        sum = 0;
        System.out.println("Insert 4 numbers. Each for the amount of vegetables grew in each 3 months of the past year");

        for (int i = 0; i < 4; i++) {
            Scanner num = new Scanner(System.in);
            vegCount[i] = num.nextInt();
            sum += vegCount[i];

        }

        float vegMonth = sum / 12;

        System.out.println("How much NIS did the seeds cost? ");
        Scanner cost = new Scanner(System.in);
        priceSeeds = cost.nextFloat();


        System.out.println("\nWhat is the total weight of the vegetables in Kilos?");
        Scanner kilo = new Scanner(System.in);
        weight = kilo.nextFloat();

        perVeg = sum / priceSeeds;
        perKilo = priceSeeds / weight;


        System.out.println("\nOk, so you got " + vegMonth+ " vegetables per month.");
        System.out.println("You paid " + perKilo +" NIS per kilo, about " + perVeg + " per Vegetable\n");
    }

    }

