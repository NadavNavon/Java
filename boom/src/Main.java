import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int n; // input variable
        int i; // counter for all the numbers until the input variable
        int j; // counter for checking if each number is a prime



        System.out.println("Insert a positive integer and the program will print the prime numbers from 1 until that number.");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            n = in.nextInt();


            for (i = 1; i <= n; i++) {
                boolean isPrime = true; //boolean flag.

                //if "i" is NOT a prime number. than the boolean flag is false. -> break the loop and move on to the next "i" number.
                for (j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                // if isPrime is true, it means the boolean flag didn't change to false and the break command wasn't execute, i.e. "i" is a prime number.
                if (isPrime){
                    System.out.println(i);
                }
            }


            if (n < 0) {
                System.out.println("You insert a negative number!");
            }

        }
        else {
            System.out.println("Your input is not an integer!");
        }
    }
}

