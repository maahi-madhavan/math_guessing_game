import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This level has a medium difficulty as it is the second level. There will be
 * feedback given back to the user no matter if they get the question right or 
 * wrong. They will also get unlimited mistakes to encourage learning and 
 * staying determined
 * 
 * Maahi Madhavan
 * 08/04/2025
 */
import java.util.Scanner;

public class Level2Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rounds = 3;
        int score = 0;

        System.out.println("Good job! You've made it to Level 2!");
        System.out.println("You'll solve " + rounds + " algebra questions.");
        System.out.println("Remember to type your answer as an integer!\n");

        // Round 1
        boolean correct = false;
        while (!correct) {
            System.out.println("Question 1: What are the zero(s) of this equation? x^2 + 2x + 1");
            System.out.print("Your answer: ");
            if (scanner.hasNextInt()) {
                int userAnswer = scanner.nextInt();
                if (userAnswer == -1) {
                    System.out.println("Correct! Great job staying focused!");
                    score += 5;
                    correct = true;
                } else {
                    System.out.println("Nice try! Keep going, you're doing great!");
                    score -= 2;
                    if (score < 0) score = 0;
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // clear the invalid input
            }
        }

        // Round 2
        correct = false;
        while (!correct) {
            System.out.println("Question 2: Solve for x: x^2 - 9 = 0");
            System.out.print("Your answer: ");
            if (scanner.hasNextInt()) {
                int userAnswer = scanner.nextInt();
                if (userAnswer == 3 || userAnswer == -3) {
                    System.out.println("Correct! You're learning fast!");
                    score += 5;
                    correct = true;
                } else {
                    System.out.println("That's okay! Keep trying!");
                    score -= 2;
                    if (score < 0) score = 0;
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }
        }

        // Round 3
        correct = false;
        while (!correct) {
            System.out.println("Question 3: Solve for x: x^2 - 4x + 3 = 0");
            System.out.print("Your answer: ");
            if (scanner.hasNextInt()) {
                int userAnswer = scanner.nextInt();
                if (userAnswer == 1 || userAnswer == 3) {
                    System.out.println("You're on fire! Great work!");
                    score += 5;
                    correct = true;
                } else {
                    System.out.println("No worries! You got this!");
                    score -= 2;
                    if (score < 0) score = 0;
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }
        }

        // Final score output
        System.out.println("\nAll done! Awesome effort!");
        System.out.println("Your score: " + score + " out of " + (rounds * 5));
        scanner.close();
    }
}

