package Tests.Example.department.impl;

import Tests.Example.cooker.Cooker;
import Tests.Example.department.Department;
import Tests.Example.menu.Dish;
import Tests.Example.menu.MenuComponents;
import Tests.Example.menu.MenuPoint;


public class TestyDepartment extends Department {
    public TestyDepartment() {
        this.cookers = new Cooker[]{
                new Cooker("Taras", new String[]{"пирожене", "крем"}),
                new Cooker("Petro", new String[]{"фрукты"}),
        };
    }

    @Override
    public Dish cook(MenuPoint menuPoint) {
        Dish dish = new Dish();
        for (String component : MenuComponents.getComponents(menuPoint)) {
            dish.add(getDishComponent(component));
        }
        return dish;
    }
}

