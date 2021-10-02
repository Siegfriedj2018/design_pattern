import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * The TriviaGame class creates a trivia game by calling getinstance
 * and it calls the private constructor.
 */
public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    /**
     * The TriviaGame constructor creates and instance of triviagame and 
     * instaniates all the needed variables and it creates an arraylist of 
     * questions by calling the dataloader which will read in questions and
     * add them to a question object, then it welcomes the user.
     */
    private TriviaGame() {
        score = 0;
        rand = new Random();
        reader = new Scanner(System.in);
        questions = DataLoader.getTriviaQuestions();
        System.out.println("Welcome to Trivia Game.");
    }

    /**
     * The getInstance method will check to see if there is already an 
     * instance of Triviagame already instaniated and if not it will create
     * one or it just returns the already active instance.
     * @return Returns a TriviaGame instance
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }

        return triviaGame;
    }

    /**
     * The play method will start the triviagame by calling playaround 
     * method and if true is returned it will increment score. 
     * Then the system will ask the user if they want to play again or quit
     * and it validates the answer if invalid character is provide they are ask
     * to try again. If valid input is provide the user is told how manyy games
     * they won and says goodbye.
     */
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
        System.out.println("\nYou won " + score + " games!");
        System.out.println("Goodbye!");
    }

    /**
     * The playround method gets a random question from the arraylist
     * and displays it and then prompts the user for an answer. It
     * then checks the users answer with the correct one and returns 
     * true or false
     * @return Returns true if correct answer provide, false otherwise.
     */
    private boolean playRound() {
        int questionNumber = rand.nextInt(questions.size() + 1);
        Question currentQuestion = questions.get(questionNumber);
        System.out.println("\n" + currentQuestion);
        System.out.print("Enter Answer: ");

        int userAnswer = 0;
        try {
            userAnswer = reader.nextInt();
            reader.nextLine(); // I'm just ignoring what happens here to advance cursor.
        } catch (Exception e) {
            System.out.println("Please enter a number 1-4.\n");
            reader.nextLine(); // I'm just ignoring what happens with incorrect input to advance cursor.
        }

        if (!currentQuestion.isCorrect(userAnswer)) {
            System.out.println("You got it wrong!");
            System.out.println("The correct answer is " + 
                                currentQuestion.getCorrectAnswer());
            return false;
        }

        System.out.println("YAY! You got it right!\n");
        return true;
    }
}