import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        System.out.println("Hello my friend! Let me recommend you a good restaurant!\n");


        //variables
        int numberOfPeople = 0;
        int restaurantType;
        char kosher;
        char mehadrin = 'b';
        String result = " ";
        boolean isInt;
        boolean isChar;


        //inputs
        while (numberOfPeople == 0) {
            System.out.println("How many people are you going with?");
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()) {
                numberOfPeople = in.nextInt();
            }
            else {
                break;
            }

            System.out.println("Should it be kosher? y/n");
            Scanner in2 = new Scanner(System.in);
            if (in2.hasNextInt()) {
                break;
            }
            kosher = in2.next().charAt(0);



            if (kosher == 'y') {
                System.out.println("Should it be mehadrin? y/n");
                Scanner in3 = new Scanner(System.in);
                if (in3.hasNextInt()) {
                    mehadrin = in3.next().charAt(0);
                    break;
                }
            }

            System.out.println("what kind of food do you want?(insert a number)\n1.Italian.\n2.Meat.\n3.Vegan");
            Scanner in4 = new Scanner(System.in);
            if (in4.hasNextInt()) {
                restaurantType = in4.nextInt();
            }
            else {
                break;
            }




            //Recommendation

            //
            if (kosher == 'y' && mehadrin == 'y') {
                if (restaurantType == 1) {
                    result = "napoli haktana";
                }
                if (restaurantType == 2) {
                    result = "lentrecote";
                }
                if (restaurantType == 3) {
                    result = "kiki";
                }

            }

            if (kosher == 'y' && mehadrin == 'n') {
                if (restaurantType == 1) {
                    result = "pizza people";
                }
                if (restaurantType == 2) {
                    result = "CHUMA";
                }
                if (restaurantType == 3) {
                    result = "HaTivonit";
                }
            } else {
                if (restaurantType == 1) {
                    result = "pasta a via";
                }
                if (restaurantType == 2) {
                    result = "Saint George";
                }
                if (restaurantType == 3) {
                    result = "Misedet Avinadav";
                }
            }


            //result
            System.out.println("I recommend you to go to \"" + result + "\", but what the hell do I know? I'm from Netanya.");

        }
    }
}