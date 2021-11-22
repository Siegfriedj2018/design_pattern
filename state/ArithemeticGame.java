import java.util.Scanner;

/**
 * The Arithmetic game class handles the setting up the game by 
 * getting random numbers from the three different states: easy,
 * medium, and hard. It starts on easy and progresses from there.
 * @author Justin Siegfried
 */
public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;

    /**
     * The arithmetic game constructor instantiates the three game
     * states and scanner class and then sets the current state to 
     * easy so the game can start.
     */
    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        score = 0;
        reader = new Scanner(System.in);
        state = easyState;
    }

    /**
     * The pressQuestionButton method handles retrieving the two random
     * numbers and the random operation then asks the user what the answer
     * is. Then it checks if the answer is equal to the sum, difference,
     * product, or quotient of the two number. If it is it prints correct
     * adds one point to the score, else it says incorrect and substracts
     * a point from score. Then if the score is >= 3 it calls the levelUp
     * method from the current state and resets score to zero. If score is 
     * <= -3 calls levelDown method and resets score to zero.
     */
    public void pressQuestionButton() {
        int num1 = state.getNum();
        int num2 = state.getNum();
        String opString = state.getOperation();
        int userAnswer;
        while (true) {
            try {
                System.out.print(num1 + " " + opString + " " + num2 + ": ");
                userAnswer = reader.nextInt();
                reader.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
            }
        }

        if (num1 + num2 == userAnswer) {
            System.out.println("Correct!");
            score++;
        } else if (num1 - num2 == userAnswer) {
            System.out.println("Correct!");
            score++;
        } else if (num1 * num2 == userAnswer) {
            System.out.println("Correct!");
            score++;
        } else if (Math.round(num1 / num2) == userAnswer) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect");
            score--;
        }

        if (score >= 3) {
            state.levelUp();
            score = 0;
        } else if (score <= -3) {
            state.levelDown();
            score = 0;
        }
    }

    /**
     * This method sets the current Arithmetic game state to 
     * the parameter.
     * @param state The new state to be assigned.
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Retrieves the easy state instance
     * @return returns the easy state
     */
    public State getEasyState() {
        return easyState;
    }

    /**
     * Retrieves the medium state instance.
     * @return Returns the medium state
     */
    public State getMediumState() {
        return mediumState;
    }

    /**
     * Retrieves the hard state instance
     * @return Returns the hard state
     */
    public State getHardState() {
        return hardState;
    }
}
