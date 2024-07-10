import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Guess a number between 1 and 100: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == numberToGuess) {
                System.out.printf("Congratulations! You found the number in %d attempts.%n", attempts);
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
    }
}