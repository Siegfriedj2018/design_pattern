import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;

    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        score = 0;
        reader = new Scanner(System.in);
        state = easyState;
    }

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

    public void setState(State state) {
        this.state = state;
    }

    public State getEasyState() {
        return easyState;
    }

    public State getMediumState() {
        return mediumState;
    }

    public State getHardState() {
        return hardState;
    }
}
