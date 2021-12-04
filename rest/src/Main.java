import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        System.out.println("Hello my friend! Let me recommend you a good restaurant!\n");


        //Variables
        int numberOfPeople = 0;
        int restaurantType = 0;
        int mehadrinCheck = 5;

        char kosher;
        char mehadrin;

        String result = " ";
        boolean isInt;
        boolean isChar;
        boolean kosherCheck = true;


        //inputs
        while (numberOfPeople == 0) {
            System.out.println("How many people are you going with?");
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()) {
                numberOfPeople = in.nextInt();
            } else {
                System.out.println("Error, false input.\nProgram exit");
                break;
            }

            System.out.println("Should it be kosher? y/n");
            Scanner in2 = new Scanner(System.in);
            if (in2.hasNextInt()) {
                break;
            }
            kosher = in2.next().charAt(0);

            if (kosher == 'y') {
                kosherCheck = true;
                System.out.println("Should it be mehadrin? y/n");
                Scanner in3 = new Scanner(System.in);
                if (in3.hasNextInt()) {
                    System.out.println("Error, false input.\nProgram exit");
                    break;
                }
                mehadrin = in3.next().charAt(0);

                if (mehadrin == 'y') {
                    mehadrinCheck = 1;
                }

                if (mehadrin == 'n') {
                    mehadrinCheck = 0;
                }


            }
            if (kosher == 'n') {
                kosherCheck = false;

            }




            System.out.println("what kind of food do you want?(insert a number)\n1.Italian.\n2.Meat.\n3.Vegan");
            Scanner in4 = new Scanner(System.in);
            if (in4.hasNextInt()) {
                restaurantType = in4.nextInt();
            } else {
                System.out.println("Error, false input.\nProgram exit");
                break;
            }


            //Recommendation

            //
            if (kosherCheck) {
                if (mehadrinCheck == 1) {

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

                if (mehadrinCheck == 0) {
                    if (restaurantType == 1) {
                        result = "pizza people";
                    }
                    if (restaurantType == 2) {
                        result = "CHUMA";
                    }
                    if (restaurantType == 3) {
                        result = "HaTivonit";
                    }

                }
            }


            else {
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
            System.out.println("I recommend you to go to \"" + result + "\", but hey.. I'm from Netanya.");

        }
    }
}
