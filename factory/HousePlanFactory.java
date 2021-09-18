/**
 * The houseplanfactory helps create the houseplan based on
 * what is passed to the parameter
 * @author Justin Siegfried
 */
public class HousePlanFactory {

    /**
     * The createHousePlan determines what plan to create
     * based on the parameter and returns that house plan
     * @param type The type is the name of house plan to create
     * @return returns the specified house plan instance
     */
    public static HousePlan createHousePlan(String type) {
        if (type.equals("log cabin")) {
            return new LogCabinPlan();
        } else if (type.equals("Tiny Home")) {
            return new TinyHomePlan();
        } else if (type.equals("contemporary home")) {
            return new ContemporaryPlan();
        }

        return null;
    }

}