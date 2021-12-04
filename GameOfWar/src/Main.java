import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        //Variables
        int choose;

        String user1Name = " ";
        String user2Name = " ";

        int user1Sum = 50, user2Sum = 50, userstotal;
        int user1Bet, user2Bet, usersBet;
        int user1Answer, user2Answer;
        int user1Card, user2Card, computerCard;


        // Intro
        System.out.println("*****Hello and welcome to the Game Of War!******\nChoose:\n1. 1 player\n2. 2 Players");

        Scanner choice = new Scanner(System.in);
        choose = choice.nextInt();

        if (choose == 1) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter your name");
            user1Name = in.next();

            System.out.println("\nHello " + user1Name + " You have " + user1Sum + " Dollars\n");


            // insert bet
            while (user1Sum > 0) {

                System.out.println("Place your next bet for the next round: 1 to " + user1Sum + " dollars:\n");

                Scanner bet = new Scanner(System.in);
                user1Bet = bet.nextInt();


                if (user1Bet <= user1Sum && user1Bet > 0) {

                    Random userRandom = new Random();
                    user1Card = userRandom.nextInt(13) + 1;
                    Random computerRandom = new Random();
                    computerCard = computerRandom.nextInt(13) + 1;

                    System.out.println("Your card is " + user1Card + " and my card is " + computerCard + "\n");


                    if (user1Card > computerCard) {
                        user1Sum = user1Sum + user1Bet;
                        System.out.println("You won " + user1Bet + " and now you have " + user1Sum + " Dollars\n");
                    } else if (user1Card < computerCard) {
                        user1Sum = user1Sum - user1Bet;
                        System.out.println("You lost " + user1Bet + " and now you have " + user1Sum + " Dollars\n");
                        if (user1Sum == 0) {
                            System.out.println("You are broke! bye bye");
                            break;
                        }
                    } else {
                        System.out.println("It's a tie, another round:");
                        continue;
                    }


                    // another bet?

                    System.out.println("What would you like to do?\n1. Play another round.\n2. Leave with my money :)");
                    Scanner answer = new Scanner(System.in);
                    user1Answer = answer.nextInt();
                    if (user1Answer == 1) { System.out.println("Lets do this");
                    }
                    else if (user1Answer == 2) {
                        break;
                    } else {
                        System.out.println("Invalid answer, bye bye");
                        break;
                    }


                } else {
                    System.out.println("I said between 1 to " + user1Sum + " and you bet " + user1Bet +
                            "\nI don't play with liars! Bye Bye");
                    break;
                }

            }


        }




        if (choose == 2) {

            int usersTotal = 50;



            Scanner player1 = new Scanner(System.in);
            System.out.println("Player 1, Enter your name");
            user1Name = player1.next();

            Scanner player2 = new Scanner(System.in);
            System.out.println("Player 2, Enter your name");
            user2Name = player2.next();


            System.out.println("\nHello " + user1Name + " and " + user2Name +
                    ". Each one of you has " + user1Sum + " Dollars to play.\n");


            while (user1Sum > 0 && user2Sum > 0) {


                //Place your bets
                System.out.println(user1Name + ", place your bet from 1 to " + usersTotal + "\n");
                Scanner bet = new Scanner(System.in);
                user1Bet = bet.nextInt();
                System.out.println(user2Name + ", place your bet from 1 to " + usersTotal + "\n");
                Scanner bet2 = new Scanner(System.in);
                user2Bet = bet2.nextInt();

                if (user1Bet > usersTotal || user1Bet < 0 || user2Bet > usersTotal || user2Bet < 0) {
                    System.out.println("You didn't put valid bet!  Bye bye ");
                    break;
                }


                if (user1Bet > user2Bet) {
                    System.out.println("This round will be on " + user1Bet);
                    usersBet = user1Bet;
                } else if (user1Bet < user2Bet) {
                    System.out.println("This round will be on " + user2Bet);
                    usersBet = user2Bet;
                } else {
                    System.out.println("You chose the same bet, great");
                    usersBet = user1Bet;
                }


                //War results
                Random userRandom = new Random();
                user1Card = userRandom.nextInt(13) + 1;
                Random user2Random = new Random();
                user2Card = user2Random.nextInt(13) + 1;


                System.out.println(user1Name + " card is " + user1Card + " and " + user2Name + " card is " + user2Card + "\n");

                if (user1Card > user2Card) {
                    user1Sum = user1Sum + usersBet;
                    user2Sum = user2Sum - usersBet;
                    System.out.println(user1Name + ", You won " + usersBet + " and now you have " + user1Sum + " Dollars\n");
                    System.out.println(user2Name + ", You lost " + usersBet + " and now you have " + user2Sum + " Dollars\n");

                    if (user1Sum > user2Sum) {
                        usersTotal = user2Sum;
                    } else if (user1Sum < user2Sum) {
                        usersTotal = user1Sum;
                    } else {
                        usersTotal = user1Sum;
                    }

                } else if (user1Card < user2Card) {
                    user1Sum = user1Sum - usersBet;
                    user2Sum = user2Sum + usersBet;
                    System.out.println(user2Name + ", You won " + usersBet + " and now you have " + user2Sum + " Dollars\n");
                    System.out.println(user1Name + ", You lost " + usersBet + " and now you have " + user1Sum + " Dollars\n");

                    if (user1Sum > user2Sum) {
                        usersTotal = user2Sum;
                    } else if (user1Sum < user2Sum) {
                        usersTotal = user1Sum;
                    } else {
                        usersTotal = user1Sum;
                    }
                } else {
                    System.out.println("It's a tie, will do it again");
                    continue;
                }


                // Continue?
                System.out.println(user1Name + "What would you like to do?\n1. Play another round.\n2. Leave with my money :)");
                Scanner answer = new Scanner(System.in);
                user1Answer = answer.nextInt();


                if (user1Answer == 1) {
                    System.out.println(user2Name + " What would you like to do?\n" +
                            "1. Play another round.\n2. Leave with my money :) \n");
                    Scanner answer2 = new Scanner(System.in);
                    user2Answer = answer2.nextInt();
                    if (user2Answer == 1) {
                        System.out.println("ok let's do this!\n");
                    } else if (user2Answer == 2) {
                        System.out.println(user2Name + " doesn't want to play anymore. Bye Bye.");
                        break;
                    } else {
                        System.out.println("Invalid answer, bye bye");
                        break;
                    }
                }
                else if (user1Answer == 2) {
                    System.out.println(user1Name + " doesn't want to play anymore. Bye Bye.");
                    break;
                }
                else {
                    System.out.println("Invalid answer, bye bye");
                    break;
                }


            }

        }

        System.out.println("You exit the game");

    }

}


