/**
 * The state interface is implemented to handle 
 * general operations that are repetitive for multiple
 * classes. The methods have to be implements in child.
 */
public interface State {
    /**
     * The getNum method gets a random number based on state
     * @return Returns a random number
     */
    public int getNum();

    /**
     * The getOperation method gets a randomly selected arithmetic operation
     * based on state.
     * @return Returns a the randomly selected operation as string
     */
    public String getOperation();
    
    /**
     * The levelUp method tells the user that they have been advanced to the 
     * next mode and calls the games setState to change states.
     */
    public void levelUp();

    /**
     * The levelDown method tells the user that they are struggling and 
     * changes states if able.
     */
    public void levelDown();
}