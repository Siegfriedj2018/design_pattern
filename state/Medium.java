import java.util.Random;
/**
 * This class is called when the user advances far enough without
 * missing any arithmetic questions. It has random numbers generated
 * from 1-50 and randomly selected operations: +,-,*. 
 * It also handles leveling up and down.
 * @author Justin Siegfried
 */
public class Medium implements State {
    private ArithemeticGame game;

    /**
     * The Medium constructor handles instantiating the medium class and 
     * setting the local instance variable to the current Arithmetic game.
     * @param game The current arithmetic game instance
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * The getNum method gets a random number between 1 and 50 inclusive
     * @return Returns a random number between 1 and 50 that is generated
     *         from randomNum
     */
    @Override
    public int getNum() {
        return randomNum(1, 50);
    }

    /**
     * The getOperation method gets a randomly selected arithmetic operation of
     * +, -, *. Using the helper method and passing only 0 so as to not go 
     * over upper bound.
     * @return Returns a the randomly selected operation
     */
    @Override
    public String getOperation() {
        String[] mediumOp = {"+", "-", "*"};
        return mediumOp[randomNum(0, 3)];
    }

    /**
     * The levelUp method tells the user that they have been advanced to the 
     * next mode and calls the games setState to change states.
     */
    @Override
    public void levelUp() {
        System.out.println("You've been advanced to the hardest mode.");
        game.setState(game.getHardState());
    }

    /**
     * The levelDown method tells the user they are struggling and changes
     * the current game state back to easy mode by calling the setState of
     * current game instance.
     */
    @Override
    public void levelDown() {
        System.out.println("You are struggling, let's go to easy mode.");
        game.setState(game.getEasyState());
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