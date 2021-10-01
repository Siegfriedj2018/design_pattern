import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    private TriviaGame() {
        score = 0;
        rand = new Random();
        reader = new Scanner(System.in);
        questions = DataLoader.getTriviaQuestions();
        System.out.println("Welcome, user to Trivia Game.");
    }

    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }

        return triviaGame;
    }

    public void play() {
        String play = "";
        boolean isFinished = false;
        while (!isFinished) {
            if (playRound()) {
                ++score;
            }

            boolean isValid = false;
            while (!isValid) {
                System.out.print("(P)lay or (Q)uit: ");
                
                try {
                    play = reader.nextLine();
                } catch (Exception e) {
                }

                if (play.equalsIgnoreCase("p") || play.equalsIgnoreCase("q")) {
                    isValid = true;
                } else {
                    System.out.println("Please enter p to play again or q to end game.");
                }
            }

            if (play.equalsIgnoreCase("q") || play.equalsIgnoreCase("quit")) {
                isFinished = true;
            }
           
        }
        reader.close();
        System.out.println("You won " + score + " games!");
        System.out.println("Goodbye!");
    }

    private boolean playRound() {
        int questionNumber = rand.nextInt(questions.size());
        Question currentQuestion = questions.get(questionNumber);
        System.out.println(currentQuestion);
        System.out.print("Enter Answer: ");

        int userAnswer = 0;
        try {
            userAnswer = reader.nextInt();
            reader.nextLine(); // I'm just ignoring what happens here to advance cursor.
        } catch (Exception e) {
            System.out.println("Please enter a number 1-4.");
            reader.nextLine(); // I'm just ignoring what happens with incorrect input to advance cursor.
        }

        if (!currentQuestion.isCorrect(userAnswer)) {
            System.out.println("You got it wrong!");
            System.out.println("The correct answer is " + currentQuestion.getCorrectAnswer());
            return false;
        }

        System.out.println("YAY! You got it right!");
        return true;
    }
}