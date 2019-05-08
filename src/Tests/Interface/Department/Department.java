package Tests.Interface.Department;

import Tests.Example.cooker.Cooker;

public class Department {
    Cooker[] cookers;
    Cooker chef;

    String getDishComponents(String component) {
        for (Cooker cooker : cookers) {
            if (haveCurrentResponsibility(cooker.getResponsibility(), component))
                return cooker.addDishComponent(component);
        }
        return null;
    }

    private boolean haveCurrentResponsibility(String[] responsibilities, String component) {
        for (String responsibility : responsibilities) {
            if (responsibility.equals(component)) {
                return true;
            }
        }
        return false;
    }
}
