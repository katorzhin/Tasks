package Tests.Example.department;
import Tests.Example.menu.Dish;
import Tests.Example.menu.MenuPoint;
import Tests.Example.cooker.Cooker;



public abstract class Department {
    protected Cooker[] cookers;

    protected Cooker chief;

    public abstract Dish cook(MenuPoint menuPoint);

    protected String getDishComponent(String component) {
        for (Cooker cooker : cookers) {
            if (haveCurrentResponsibility(cooker.getResponsibility(), component))
                return cooker.addDishComponent(component);
        }
        return null;
    }

    private boolean haveCurrentResponsibility(String[] responsibilities, String component) {
        for (String responsibility : responsibilities) {
            if (responsibility.equals(component)) return true;
        }
        return false;
    }
}


