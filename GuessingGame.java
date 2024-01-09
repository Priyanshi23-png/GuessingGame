import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int maxNumber = 51; 
        int correctGuess = numberGenerator.nextInt(maxNumber);
        int numberTried = 0;
        int numberGuessed;
        int maxAttempts = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String user = scanner.nextLine();
        while (user.length() == 0) {
            System.out.println("Please enter your name:");
            user = scanner.nextLine();
        }
        System.out.println("Hello " + user + "! Welcome to the guessing game.");
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("Guess a number between 0 and " + (maxNumber - 1) + ":");
            numberGuessed = scanner.nextInt();
            numberTried++;
            if (numberGuessed == correctGuess) {
                System.out.println("Congratulations " + user + "! You have successfully guessed the correct number in "
                        + numberTried + " attempt(s)");
                break;
            } else if (numberGuessed < correctGuess) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Your guess is too high");
            }
            if (attempt == maxAttempts) {
                System.out.println("Sorry, " + user + ", you didn't guess the number in " + maxAttempts
                        + " attempts. The correct number was " + correctGuess);
            }
        }
        System.out.println("Thank you for playing");
        scanner.close();
    }
}
