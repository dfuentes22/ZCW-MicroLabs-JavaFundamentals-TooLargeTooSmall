/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        System.out.print("Guess a number from 1 to 100: ");
        //Hold number of guesses
        int numOfGuesses = 0;
        //While loop check
        boolean guessRight = false;
        //Random Number
        Random rand = new Random();
        int numToGuess = rand.nextInt(100) + 1;
        //Input
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        while (!guessRight) {

            //Add to number of guesses
            numOfGuesses++;
            if (guess > numToGuess) {
                System.out.print("Guess is too large, guess again: ");
            } else if (guess < numToGuess) {
                System.out.print("Guess is too small, guess again: ");
            } else {
                System.out.print("\nCorrect guess\nNumber to guess: " + numToGuess + "\nNumber of guesses: " + numOfGuesses);
                break;
            }

            //new guess if guess is larger or smaller
            int newGuess = input.nextInt();

            //checks for consecutive number
            if (newGuess == guess) {
                while (newGuess == guess){
                    System.out.print("Please guess another number: ");
                    newGuess = input.nextInt();
                }
            }
            //passed the consecutive check and makes guess the new guess for next loop
            guess = newGuess;
        }
    }
}
