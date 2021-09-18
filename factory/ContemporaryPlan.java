/**
 * This class defines a contemporary plan.
 * @author
 */
public class ContemporaryPlan extends HousePlan {

    /**
     * The constructor creates the contemporary house instance and
     * passes the required parameters to super.
     */
    public ContemporaryPlan() {
        super(5, 40, 3000);
    }

    /**
     * The setMaterials is an abstract method that sets the material
     * arraylist.
     */
    @Override
    protected void setMaterials() {
        materials.add("Ceramics");
        materials.add("High-Strength Alloys");
        materials.add("Composites");
    }

    /**
     * The setFeatures is an abstract method that sets the features
     * arraylist. 
     */
    @Override
    protected void setFeatures() {
        features.add("Oversized Windows");
        features.add("Unconventional Roofs");
        features.add("Minimalism");
        features.add("Open Floor Plan");        
    }

    /**
     * Returns the string represetation of a Contemporary home.
     */
    public String toString() {
        return "Contemporary Home\n" + super.toString();
    }
    
}