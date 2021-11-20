import java.util.Random;
public class Hard implements State {
    private ArithemeticGame game;

    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    @Override
    public int getNum() {
        return randomNum(1, 100);
    }

    @Override
    public String getOperation() {
        String[] hardOp = {"+", "-", "*", "/"};
        return hardOp[randomNum(0, 4)];

    }

    @Override
    public void levelUp() {
        System.out.println("You are doing so well!!!");
    }

    @Override
    public void levelDown() {
        System.out.println("You are struggling, let's go to medium mode.");
        game.setState(game.getMediumState());
    }

    private int randomNum(int lower, int upper) {
        Random rand = new Random();
        int easyRand = rand.nextInt(upper);
        return easyRand + lower;
    }
}