/**
 * The Question class creates a question instance and 
 * it can check if the user entered the correct answer,
 * or get the correct answer to the question.
 */
public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

    /**
     * The question constructor creates a question object and assigns 
     * the appropriate variables.
     * @param question The question to store in array.
     * @param ans1 The first answer to question.
     * @param ans2 The second answer to question.
     * @param ans3 The third answer to question.
     * @param ans4 The fourth answer to question.
     * @param correctAnswer The correct answer that is zero-based.
     */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        this.question = question;
        answers = new String[4];
        answers[0] = ans1;
        answers[1] = ans2;
        answers[2] = ans3;
        answers[3] = ans4;
        this.correctAnswer = correctAnswer;
    }

    /**
     * The toString method returns a string representation of the 
     * the question and the answers.
     */
    public String toString() {
        String result = question + "\n";
        for (int i = 0; i < 4; ++i) {
            result += (i + 1) + ". " + answers[i] + "\n";
        }

        return result;
    }

    /**
     * The isCorrect method compares the user answer to the correct answer
     * that is stored and returns true or false. correctAnswer is zero-based 
     * so one is added to it for comparison.
     * @param userAnswer The user input.
     * @return Returns true if correct, false otherwise.
     */
    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswer + 1;
    }

    /**
     * The getCorrectAnswer gets the correct answer from the array of answers.
     * @return Returns the correct answer from array using correctAnswer variable.
     */
    public String getCorrectAnswer() {
        return answers[correctAnswer];
    }
}