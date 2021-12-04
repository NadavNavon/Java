import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //variables
        int i, j, k;
        String sentence;
        String longest = " ";
        String sentenceParts[];
        int onlyWordslength;


        Scanner in = new Scanner(System.in);
        System.out.println("Insert a sentence and the program will print the longest word");
        sentence = in.nextLine();

        sentenceParts = sentence.split(" ");
        onlyWordslength = sentenceParts.length;

        // REMOVE ALL STRINGS WITH DIGITS IN IT
        for (j = 0; j < sentenceParts.length; j++){

            if(sentenceParts[j].contains("1")
                    || sentenceParts[j].contains("2")
                    || sentenceParts[j].contains("3")
                    || sentenceParts[j].contains("4")
                    || sentenceParts[j].contains("5")
                    || sentenceParts[j].contains("6")
                    || sentenceParts[j].contains("7")
                    || sentenceParts[j].contains("8")
                    || sentenceParts[j].contains("9")
                    || sentenceParts[j].contains("0")
                    || sentenceParts[j].contains("=")
                    || sentenceParts[j].contains("!")

                    ){
                onlyWordslength --;
            }
        }
        //Creating a new string, it's length is the number of words without any numbers and ! =  symbols.
        String sentencePartsWords[] = new String[onlyWordslength];

        //Insert only the words into the new string
        int count = 0;
        for (i = 0; i < sentenceParts.length; i++){
            if (!sentenceParts[i].contains("1")
                    && !sentenceParts[i].contains("2")
                    && !sentenceParts[i].contains("3")
                    && !sentenceParts[i].contains("4")
                    && !sentenceParts[i].contains("5")
                    && !sentenceParts[i].contains("6")
                    && !sentenceParts[i].contains("7")
                    && !sentenceParts[i].contains("8")
                    && !sentenceParts[i].contains("9")
                    && !sentenceParts[i].contains("0")
                    && !sentenceParts[i].contains("=")
                    && !sentenceParts[i].contains("!")
                    )
                    {
                    sentencePartsWords[count] = sentenceParts[i];
                    count++;
                    }
        }


        //This code finds the longest word in the sentencePartsWords string.
        longest = sentencePartsWords[0];
        for (k = 1; k < sentencePartsWords.length; k++){

            if (sentencePartsWords[k].length() > longest.length())

            longest = sentencePartsWords[k];
            }

        System.out.println("The longest word is " + longest);
        }


    }

