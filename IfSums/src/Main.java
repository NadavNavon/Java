
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        float num1;
        float num2;
        float sum;

        System.out.println("Please insert two numbers:");
        Scanner number1 = new Scanner(System.in);
        num1 = number1.nextFloat();
        Scanner number2 = new Scanner(System.in);
        num2 = number2.nextFloat();

        sum = num1 + num2;

        if (sum == 10) {
            System.out.println("makes 10");
        }
        else {
            System.out.println("nope");
        }
    }
}
