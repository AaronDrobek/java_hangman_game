package com.drobek.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String... arg) {
        GamePlay gamePlay = new GamePlay();
        List<String> guessedLetters = new ArrayList<String>();

        int guessCount = 0;


        gamePlay.buildGameBoard();

       do {

           System.out.println(guessedLetters + " guessed letters");
           System.out.println(guessCount + " number of wrong guesses");
           System.out.println("enter your guess");
           String userGuess = scanner.next();
           guessedLetters.add(userGuess);
           if(gamePlay.printGameBoard(userGuess)==false){
               guessCount ++;
           }
           System.out.println();
           callSwitch(guessCount);
           System.out.println();
       }while(guessCount  < 5);

        System.out.println("Game over");
        System.out.println("your word was " + gamePlay.randomWord);




    }
    public static void callSwitch(int guessCount){
        switch (guessCount){
            case 0:
                break;
            case 1:
                printGallow();
                break;
            case 2:
                printHead();
                break;
            case 3:
                printBody();
                break;
            case 4:printLegs();
                break;
            case 5:
                printArms();
                break;
        }
    }

    public static void printGallow(){

        System.out.println("   ____________");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   | ");
        System.out.println("___|___");
    }
    public static void printHead() {

        System.out.println("   ____________");
        System.out.println("   |          _|_");
        System.out.println("   |         /   \\");
        System.out.println("   |        |     |");
        System.out.println("   |         \\_ _/");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("___|___");
    }
    public static void printBody(){

        System.out.println("   ____________");
        System.out.println("   |          _|_");
        System.out.println("   |         /   \\");
        System.out.println("   |        |     |");
        System.out.println("   |         \\_ _/");
        System.out.println("   |           |");
        System.out.println("   |           |");
        System.out.println("   |");
        System.out.println("___|___");
    }
    public static void printLegs(){

        System.out.println("   ____________");
        System.out.println("   |          _|_");
        System.out.println("   |         /   \\");
        System.out.println("   |        |     |");
        System.out.println("   |         \\_ _/");
        System.out.println("   |           |");
        System.out.println("   |           |");
        System.out.println("   |          / \\ ");
        System.out.println("___|___      /   \\");
    }
    public static void printArms(){

        System.out.println("   ____________");
        System.out.println("   |          _|_");
        System.out.println("   |         /   \\");
        System.out.println("   |        |     |");
        System.out.println("   |         \\_ _/");
        System.out.println("   |          _|_");
        System.out.println("   |         / | \\");
        System.out.println("   |          / \\ ");
        System.out.println("___|___      /   \\");
    }

}
