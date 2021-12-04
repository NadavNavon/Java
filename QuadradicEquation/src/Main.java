import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //variables
    double a;
    double b;
    double c;

    double positiveQuadradicResult;
    double negitiveQuadradicResult;

    //inputs
    System.out.println("Pleas insert coefficient a:");
    Scanner a_input = new Scanner(System.in);
    a = a_input.nextFloat();

    System.out.println("Pleas insert coefficient b:");
    Scanner b_input = new Scanner(System.in);
    b = b_input.nextFloat();


    System.out.println("Pleas insert coefficient c:");
    Scanner c_input = new Scanner(System.in);
    c = c_input.nextFloat();


    //math calculations
    positiveQuadradicResult = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
    negitiveQuadradicResult = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);


    //output
    System.out.println("X1 equals " + positiveQuadradicResult + "\n X2 equals " + negitiveQuadradicResult );


    }
}
