import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    String text;
    String text2 = " ";

    System.out.println("Enter a string and the program will replace small vowels with Capital vowels");
    Scanner in = new Scanner(System.in);
    text = in.nextLine();


    System.out.println(text);

    text = text.replace('a', 'A');
    text = text.replace('e', 'E');
    text = text.replace('i', 'I');
    text = text.replace('o', 'O');
    text = text.replace('u', 'U');
    text = text.replace('y', 'Y');

    System.out.print(text);



    //attampt with for loops
//    for (int i = 0; i < text.length(); i++){
//
//        if (text.charAt(i) == 'i') { text2 += 'I';}
//        else if (text.charAt(i) == 'o') { text2 += 'O';}
//        else {text2 += text.charAt(i);}
//
//
//        System.out.print(text2.charAt(i));
//
//    }



    }
}
