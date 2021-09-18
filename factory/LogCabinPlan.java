/**
 * This class defines a log cabin plan.
 * @author Justin Siegfried
 */
public class LogCabinPlan extends HousePlan {
    
    /**
     * The constructor create the log cabin instance and 
     * passes the required parameters to the super class.
     */
    public LogCabinPlan() {
        super(2, 10, 1800);
    }

    /**
     * The setMaterials is an abstract method that sets the material
     * arraylist.
     */
    @Override
    protected void setMaterials() {
        materials.add("Log Siding");
        materials.add("Board and Batton Siding");
        materials.add("White Pine");
    }

    /**
     * The setFeatures is an abstract method that sets the features
     * arraylist. 
     */
    @Override
    protected void setFeatures() {
        features.add("Timbered Roof");
        features.add("High Insulation");
        features.add("Rustic Effect");        
    }

    /**
     * Returns a string reprentation of a log cabin.
     */
    public String toString() {
        return "Log Cabin\n" + super.toString();
    }
}