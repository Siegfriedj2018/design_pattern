public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        this.question = question;
        answers = new String[4];
        answers[0] = ans1;
        answers[1] = ans2;
        answers[2] = ans3;
        answers[3] = ans4;
        this.correctAnswer = correctAnswer;
    }

    public String toString() {
        String result = question + "\n";
        for (int i = 0; i < 4; ++i) {
            result += (i + 1) + ". " + answers[i] + "\n";
        }
        
        return result;
    }

    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswer + 1;
    }

    public String getCorrectAnswer() {
        return answers[correctAnswer];
    }
}