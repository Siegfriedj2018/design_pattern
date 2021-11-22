import java.util.Random;

/**
 * This class is called when the user advances far enough without
 * missing any arithmetic questions. It has random numbers generated
 * from 1-100 and +,-,*,/. It also handles leveling up and down.
 * @author Justin Siegfried
 */
public class Hard implements State {
    private ArithemeticGame game;

    /**
     * The Hard constructor handles instantiating the hard class and 
     * setting the local instance variable to the current Arithmetic game.
     * @param game The current arithmetic game instance
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * The getNum method gets a random number between 1 and 100 inclusive
     * @return Returns a random number between 1 and 100 that is generated
     *         from randomNum
     */
    @Override
    public int getNum() {
        return randomNum(1, 100);
    }

    /**
     * The getOperation method gets a randomly selected arithmetic operation of
     * +, -, *, /. Using the helper method and passing only 0 so as to not go 
     * over upper bound.
     * @return Returns a the randomly selected operation
     */
    @Override
    public String getOperation() {
        String[] hardOp = {"+", "-", "*", "/"};
        return hardOp[randomNum(0, 4)];

    }

    /**
     * The levelUp method just prints encouraging phrase to user
     */
    @Override
    public void levelUp() {
        System.out.println("You are doing so well!!!");
    }

    /**
     * The levelDown method tells the user they are struggling and changes
     * the current game state to medium by calling the setState and getMediumState
     */
    @Override
    public void levelDown() {
        System.out.println("You are struggling, let's go to medium mode.");
        game.setState(game.getMediumState());
    }

    /**
     * This is a private helper method that gets a random number
     * @param lower the desired lower bound, preferred one or zero.
     * @param upper the desired upper bound for Random class
     * @return Returns an int that is between lower and upper as long
     *         as lower is 1 or 0.
     */
    private int randomNum(int lower, int upper) {
        Random rand = new Random();
        int easyRand = rand.nextInt(upper);
        return easyRand + lower;
    }
}