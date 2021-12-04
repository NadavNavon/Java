import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //variables
        String text;
        String reverseText = "";
        int i;
        int j;
        boolean palindrome = true; // boolean to stop a loop that checks if the input is a palindrome.

        System.out.println("Enter a string and the program will check if it's a palindrome");
        Scanner in = new Scanner(System.in);
        text = in.nextLine();

        // loop for creating the reverse of an input
        for (i = text.length() - 1; i >= 0; i--) {
            reverseText += text.charAt(i);
        }


        // loop for comparing the input[j] with the reverse input[j].
        for (j = 0; j < text.length(); j++) {
            if (text.charAt(j) != reverseText.charAt(j)) {
                palindrome = false; System.out.println("Not a palindrome");
                break;
            }
        }
        //condition, if the initial boolean remains true, it means palindrome
        if (palindrome) {
            System.out.println("It is a palindrome");
        }
    }
}
