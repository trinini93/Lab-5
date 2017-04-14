// Author: Trina Chowdhury, Java April 2017


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //scanner for user input
        Scanner scnr = new Scanner(System.in);
        //header, asking user how many sides die should have. \n function

        String userWords = "y"; //userWords is for the y/n part
        do {
            System.out.println("Welcome to Grand Circus Casino!\nHow many sides will each die have? ");
            //ask user how many sides each die should have
            int userInput = scnr.nextInt(); //userInput is for integer
            scnr.nextLine(); //GARBAGE SCAN so that it picks up the next scnr for string

            //directions to roll dice
            System.out.println("Roll 1: ");
            //sout twice to generate 2 random nums
            System.out.println(randomGen(userInput));
            System.out.println(randomGen(userInput));

            System.out.println("Roll again? y/n ");
            userWords = scnr.nextLine();

        } while (userWords.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing, goodbye! ");

    }
    //method created to generate random number
    public static int randomGen(int diceRoll) {
        //random method initiated
        Random rand = new Random();

        //return .nextInt method
        return rand.nextInt(diceRoll) + 1;


    }
}
