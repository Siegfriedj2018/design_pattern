
public class Hard implements State {
    private ArithmeticGame game;

    public Hard(ArithmeticGame game) {
        this.game = game;
    }

    public int getNum() {
        return randomNum(1, 100);
    }

    public String getOperation() {
        String[] hardOp = {"+", "-", "*", "/"};
        return hardOp[randomNum(0, 4)];

    }

    public void levelUp() {
        System.out.println("You are doing so well!!!");
    }

    public void levelDown() {
        System.out.println("You are struggling, let's go to medium mode.");
        game.setState(game.getMediumState);
    }

    private int randomNum(int lower, int upper) {
        Random rand = new Random();
        int easyRand = rand.nextInt(upper);
        return easyRand + lower;
    }
}