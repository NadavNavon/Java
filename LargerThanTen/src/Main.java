import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int num;

        System.out.println("please input a number larger than 10:");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        //While loop ,as number of inputs is unknown
        while (num < 10) {
            System.out.println("please input a number LARGER than 10:");
            Scanner in2 = new Scanner(System.in);
            num = in2.nextInt();
        }

       if (num > 10) {
            System.out.println("Thank you");
        }


    }
}
