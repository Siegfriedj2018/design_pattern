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

    }

    public void setState(State state) {

    }

    public State getEasyState() {

    }

    public State getMediumState() {

    }

    public State getHardState() {

    }
}
