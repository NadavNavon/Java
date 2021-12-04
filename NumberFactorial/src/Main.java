import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int num;
        int factorial = 1;
        int i;

        System.out.println("Input a number and i'll calculate its factorial");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        if (num >= 0) {
            for (i = 1; i <= num; i++) {
                if (num < 1) {
                    factorial = 1;
                } else {
                    factorial = i * factorial;
                }

            }

            System.out.println("N facotial is " + factorial);
        } else {
            System.out.println("You didn't insert a positive integer");


        }
    }
}
