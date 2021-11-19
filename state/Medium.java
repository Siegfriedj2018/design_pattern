
public class Medium {
    private ArithemeticGame game;

    public Medium(ArithmeticGame game) {
        this.game = game;
    }
    
    public int getNum() {
        return randomNum(1, 50);
    }

    public String getOperation() {
        String[] mediumOp = {"+", "-", "*"};
        return mediumOp[randomNum(0, 3)];
    }

    public void levelUp() {
        System.out.println("You've been advanced to the hardest mode.");
        game.setState(game.getHardState());
    }

    public void levelDown() {
        System.out.println("You are struggling, let's go to easy mode.");
        game.setState(game.getEasyState());
    }

    private int randomNum(int lower, int upper) {
        Random rand = new Random();
        int easyRand = rand.nextInt(upper);
        return easyRand + lower;
    }
}