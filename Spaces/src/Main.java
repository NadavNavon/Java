import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


	String test;

    Scanner in = new Scanner(System.in);
    System.out.println("Insert a sentence and the program will replace all white space into stars");
    test = in.nextLine();

    test = test.replace(" ","*");

    System.out.println(test);

    }
}
