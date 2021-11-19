import java.util.Random;
public class Easy implements State {
    private ArithemeticGame game;
    
    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    @Override
    public int getNum() {
        return randomNum(1, 10);
    }

    @Override
    public String getOperation() {
        String[] easyOperation = {"+", "-"};
        return easyOperation[randomNum(0, 2)];
    }

    @Override
    public void levelUp() {
        System.out.println("You've been advanced to medium mode.");
        game.setState(game.getMediumState());
    }

    @Override
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }

    private int randomNum(int lower, int upper) {
        Random rand = new Random();
        int easyRand = rand.nextInt(upper);
        return easyRand + lower;
    }


}