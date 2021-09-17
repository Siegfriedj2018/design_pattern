public class HousePlanFactory {

    public HousePlan createHousePlan(String type) {
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