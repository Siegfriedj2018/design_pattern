/**
 * This class defines a tiny house plan.
 * @author Justin Siegfried
 */
public class TinyHomePlan extends HousePlan{

    /**
     * This constructor creates a tiny house plan instance and 
     * passes the required parameters to the super.
     */
    public TinyHomePlan() {
        super(1, 5, 200);
    }

    /**
     * The setMaterials is an abstract method that sets the material
     * arraylist.
     */
    @Override
    protected void setMaterials() {
        materials.add("Lumber");
        materials.add("Insulation");
        materials.add("Metal Roofing");
        materials.add("Hardware");
    }

    /**
     * The setFeatures is an abstract method that sets the features
     * arraylist. 
     */
    @Override
    protected void setFeatures() {
        features.add("Natural Light");
        features.add("Creative Storage");
        features.add("Multipurpose areas");
        features.add("Multi-use applications");
    }

    /**
     * Returns the string representation of the of a tiny house plan
     */
    public String toString() {
        return "Tiny House\n" + super.toString();
    }
}