import java.util.Scanner;

/**
 * This is Level 1 of the math game. It introduces basic algebra problems 
 * to help students build confidence. Unlimited tries are allowed to 
 * encourage learning through mistakes.
 * 
 * Meghna Magesh
 * 08/05/2025
 */
public class Level1Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rounds = 3;
        int score = 0;

        System.out.println("Welcome to Level 1!");
        System.out.println("Let's warm up with some simple math questions.");
        System.out.println("Type your answers as integers. Don't worry—you can try as many times as you want!\n");

        // Question 1
        boolean correct = false;
        while (!correct) {
            System.out.println("Question 1: What is x if x + 2 = 5?");
            System.out.print("Your answer: ");
            if (scanner.hasNextInt()) {
                int userAnswer = scanner.nextInt();
                if (userAnswer == 3) {
                    System.out.println("Awesome! You're off to a great start!");
                    score += 5;
                    correct = true;
                } else {
                    System.out.println("Keep trying, you're getting closer!");
                    score -= 1;
                    if (score < 0) score = 0;
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // clear invalid input
            }
        }

        // Question 2
        correct = false;
        while (!correct) {
            System.out.println("Question 2: What is x if 2x = 10?");
            System.out.print("Your answer: ");
            if (scanner.hasNextInt()) {
                int userAnswer = scanner.nextInt();
                if (userAnswer == 5) {
                    System.out.println("Nice work! You're doing great!");
                    score += 5;
                    correct = true;
                } else {
                    System.out.println("Not quite—try again!");
                    score -= 1;
                    if (score < 0) score = 0;
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }
        }

        // Question 3
        correct = false;
        while (!correct) {
            System.out.println("Question 3: What is x if x - 4 = 2?");
            System.out.print("Your answer: ");
            if (scanner.hasNextInt()) {
                int userAnswer = scanner.nextInt();
                if (userAnswer == 6) {
                    System.out.println("Great job! You're ready for Level 2!");
                    score += 5;
                    correct = true;
                } else {
                    System.out.println("Don't give up! You can do it!");
                    score -= 1;
                    if (score < 0) score = 0;
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }
        }

        // Final output
        System.out.println("\nWell done finishing Level 1!");
        System.out.println("Your score: " + score + " out of " + (rounds * 5));
        scanner.close();
    }
}
