package com.codeSoft;
import java.util.Random;
import java.util.Scanner;
public class NumberGame {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        Random random = new Random();
	        int score = 0;
	        String playAgain;

	        do {
	            int number = random.nextInt(100) + 1;
	            int attempts = 5;
	            boolean guessed = false;

	            System.out.println("Guess the number between 1 and 100");
	            System.out.println("You have " + attempts + " attempts.");

	            while (attempts > 0) {
	                System.out.print("Enter your guess: ");
	                int guess = sc.nextInt();
	                attempts--;

	                if (guess == number) {
	                    System.out.println("Correct!");
	                    score++;
	                    guessed = true;
	                    break;
	                } else if (guess > number) {
	                    System.out.println("Too High!");
	                } else {
	                    System.out.println("Too Low!");
	                }

	                System.out.println("Attempts left: " + attempts);
	            }

	            if (!guessed) {
	                System.out.println("Out of attempts! The number was: " + number);
	            }

	            System.out.println("Your Score: " + score);
	            System.out.print("Do you want to play again? (yes/no): ");
	            playAgain = sc.next();

	        } while (playAgain.equalsIgnoreCase("yes"));

	        System.out.println("Thanks for playing!");
	        sc.close();
	    }
	

	

}


