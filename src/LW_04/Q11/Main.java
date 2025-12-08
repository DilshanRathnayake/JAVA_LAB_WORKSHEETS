package LW_04.Q11;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Enter a number between 1 and 100:");

        while (guess != number) {

            guess = scanner.nextInt();

            if (guess < number) {
                System.out.println("Higher!");
            } else if (guess > number) {
                System.out.println("Lower!");
            }
        }

        System.out.println("Correct Number! It was " + number);
        scanner.close();
    }
}
