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

public class level2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rounds = 3;
        int score = 0;

        System.out.println("Good job! You've made it to Level 2!");
        System.out.println("You'll solve " + rounds + " algebra questions. Remember to type your answer as an integer!\n");

        // Round 1
        System.out.println("Round 1: What are the zero(s) of this equation?  x^2 + 2x + 1");
        System.out.print("Your answer: ");
        while (true) {
            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                if (answer == -1) {
                    score+=5;
                    System.out.println("Great Job! Let's move to the next round\n");
                    break;
                }
                else if (answer != -1){
                    if (score>=2){
                        score-=2;
                    }
                    System.out.println("Nice try! Keep going!\n");
                }
        
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // consume invalid input
            }
        }

        // Round 2
        System.out.println("Round 2: Solve for x: x^2 - 5x + 6 = 0");
        System.out.print("Your answer (give one of the zeros): ");
        while (true) {
            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                if (answer == 2 || answer == 3) {
                    score+=5;
                    System.out.println("Great Job! Let's move to the next round\n");
                    break;
                }
                else if (answer != 2 || answer!= 3){
                    if (score>=2){
                        score-=2;
                    }
                    System.out.println("Nice try! Keep going!\n");
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }
        }

        // Round 3
        System.out.println("Round 3: Solve for x: x^2 - 4 = 0");
        System.out.print("Your answer (give one of the zeros): ");
        while (true) {
            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                if (answer == 2 || answer == -2) {
                    score+=5;
                    System.out.println("Awesome job! You're doing amazing!\n");
                    break;
                }
                else if (answer != 2 || answer!= -2){
                    if (score>=2){
                        score-=2;
                    }
                    System.out.println("Nice try! Keep going!\n");
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }
        }

        System.out.println("You've completed Level 2! Well done!");
        System.out.println("Your score: " + score + " out of " + rounds);
        scanner.close();
    }
}
