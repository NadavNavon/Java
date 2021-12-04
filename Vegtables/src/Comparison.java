import java.util.Scanner;

public class Comparison {

    String answer;

    public void comparison(float a, float b){

        if (a > b)
            System.out.println("You saved money, great!");
        else if (a < b){
            System.out.println("Meaning you could have saved more money buying from the Market.. " +
                    "but hey, did you enjoy the process? answer in Yes / No ");

            Scanner input = new Scanner(System.in);
            answer = input.next();

            switch(answer){
                case "Yes":
                    System.out.println("Awosome, it was worth it!");
                    break;
                case "No":
                    System.out.println("Too bad, go to the market than.");
                    break;
                default:
                    System.out.println("You have a syntax error with you answer");
                    break;
            }


        }
        else {
            System.out.println("It cost you the same");
        }


    }

}
