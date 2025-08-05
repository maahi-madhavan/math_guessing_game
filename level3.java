import greenfoot.*;

/**
 * QuestionManager handles all question logic for Level 3.
 * It shows one quadratic equation at a time and accepts only
 * the POSITIVE integer solution from the player.
 *
 * Features:
 * - Keyboard input (digits and backspace)
 * - Unlimited tries
 * - Feedback messages and scoring
 * - Final score display at the end
 *
 * Samreen Khosla
 * 08/04/2025
 */

public class QuestionManager extends Actor {
    private String input = "";
    private int score = 0;
    private int questionNumber = 0;

    // Questions with exactly one correct positive root
    private String[] questions = {
        "Solve: x^2 - 5x + 6 = 0 (Enter only the positive solution)",
        "Solve: x^2 - 7x + 12 = 0 (Enter only the positive solution)",
        "Solve: x^2 - 9x + 20 = 0 (Enter only the positive solution)"
    };

    private int[][] correctAnswers = {
        {3},  // Only accepting positive root
        {4},
        {5}
    };

    public QuestionManager() {
        // Show instructions and the first question right away
        updateDisplay("Level 3: Type only the positive answer and press Enter.\n\n"
            + questions[questionNumber] + "\nAnswer: ");
    }

    public void act() {
        checkKeyPress();
    }

    private void checkKeyPress() {
        String key = Greenfoot.getKey();
        if (key != null) {
            if (key.equals("enter")) {
                tryAnswer();
            } else if (key.equals("backspace") && input.length() > 0) {
                input = input.substring(0, input.length() - 1);
                updateDisplay(questions[questionNumber] + "\nAnswer: " + input);
            } else if (key.matches("\\d")) {  // Only allow digits (no negative sign)
                input += key;
                updateDisplay(questions[questionNumber] + "\nAnswer: " + input);
            }
        }
    }

    private void tryAnswer() {
        try {
            int guess = Integer.parseInt(input);
            int[] correct = correctAnswers[questionNumber];
            if (guess == correct[0]) {
                score += 5;
                questionNumber++;
                if (questionNumber >= questions.length) {
                    updateDisplay("Great job! Final score: " + score);
                    Greenfoot.stop();
                } else {
                    input = "";
                    updateDisplay("Correct! Next:\n" + questions[questionNumber] + "\nAnswer: ");
                }
            } else {
                score = Math.max(0, score - 2);
                input = "";
                updateDisplay("Oops! Try again.\n" + questions[questionNumber] + "\nAnswer: ");
            }
        } catch (NumberFormatException e) {
            input = "";
            updateDisplay("Invalid input. Please enter numbers only.");
        }
    }

    private void updateDisplay(String text) {
        GreenfootImage img = new GreenfootImage(text, 24, Color.BLACK, Color.WHITE);
        setImage(img);
    }
}
