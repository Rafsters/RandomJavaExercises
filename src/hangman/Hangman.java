package hangman;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] wordsArray = {"something", "word", "apple", "nothing", "java", "computer", "phone", "orange", "random", "table", "mouse"};
        Random r = new Random();
        int randomNumber = r.nextInt(wordsArray.length);
        String randomWord = wordsArray[randomNumber];
        StringBuilder guessedWord = new StringBuilder();
        for (int i = 0; i < randomWord.length(); i++) {
            guessedWord.append('_');
        }
        Scanner in = new Scanner(System.in);
        boolean guessedAllLetters = false;
        boolean letterGuess = false;
        char playerLetterInput;
        int badGuessCounter = 0; // if 5, game ends
        for (int i = 0; i < guessedWord.length(); i++) {
            System.out.print(guessedWord.charAt(i) + " ");
        }
        while(!guessedAllLetters && badGuessCounter != 5){
            letterGuess = false;
            System.out.println("\n\n");
            System.out.println("Guess what word it is, type some letter: ");
            playerLetterInput = in.next().toLowerCase().charAt(0);
            for (int i = 0; i < guessedWord.length(); i++) {
                if(playerLetterInput == randomWord.charAt(i)){
                    letterGuess = true;
                    guessedWord.setCharAt(i,playerLetterInput);
                }
            }
            if(letterGuess){
                System.out.println("Good!");
            }else{
                badGuessCounter++;
                System.out.println("Wrong letter! Wrong letter counter: " + (badGuessCounter) + "/5");
            }
            for (int i = 0; i < guessedWord.length(); i++) {
                System.out.print(guessedWord.charAt(i) + " ");
            }
            if(randomWord.equals(guessedWord.toString())){
                guessedAllLetters = true;
                System.out.println("\n Congratz!");
            }
        }

    }
}
