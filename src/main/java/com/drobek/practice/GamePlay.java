package com.drobek.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GamePlay {
    List<Letter> allLetters = new ArrayList<Letter>();
    List<String> wordList = Arrays.asList("target", "school", "pressure", "time", "friday", "computer", "helicopter", "jump","dog","parrot","record", "empty","magazine");
    String randomWord;
    int guessedCorrect = 0;

    public void buildGameBoard() {
        Random rand = new Random();
        int listLen = wordList.size() - 1;
        int randomNum = rand.nextInt(listLen - 0 + 1) + 0;
        randomWord = wordList.get(randomNum);
        int randomWordLen = randomWord.length();

        for (int eachLetter = 0; eachLetter < randomWordLen; eachLetter++) {
            Letter letter = new Letter();
            letter.setDisplayIcon('_');
            letter.setVaulue(randomWord.charAt(eachLetter));
            allLetters.add(letter);
            System.out.print(letter.getDisplayIcon() + " ");
        }
//        System.out.println(randomWord + " this is random ");
//        System.out.println(randomNum + " this is random");
//        System.out.println(randomWordLen + " word length");
    }

    public boolean printGameBoard(String guess, List<String> guessedList) {
        boolean found = false;
        char guessed = guess.charAt(0);


                for (int eachLetter = 0; eachLetter < allLetters.size(); eachLetter++) {
                    if (guessed == allLetters.get(eachLetter).getVaulue()) {
                        found = true;
                        guessedCorrect++;
                        allLetters.get(eachLetter).setDisplayIcon(allLetters.get(eachLetter).getVaulue());
                    }

                    System.out.print(allLetters.get(eachLetter).getDisplayIcon() + " ");
                }

        if (guessedCorrect == allLetters.size()) {

            System.out.println();
            System.out.println("********************************************************");
            System.out.println("*************    YOU WON!!!!!!!!!!!!!!    **************");
            System.out.println("********************************************************");


        }
        return found;

    }

}
