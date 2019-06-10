package tests.example.department.impl;

import tests.example.cooker.Cooker;
import tests.example.department.Department;
import tests.example.menu.Dish;
import tests.example.menu.MenuComponents;
import tests.example.menu.MenuPoint;


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

