package tests.example.department.impl;

import tests.example.department.Department;
import tests.example.menu.Dish;
import tests.example.menu.MenuComponents;
import tests.example.menu.MenuPoint;
import tests.example.cooker.Cooker;

public class HotDepartment extends Department {
    public HotDepartment() {
     this.cookers = new Cooker[]{
        new Cooker("Alla", new String[]{"картошка", "тесто"}),
                new Cooker("Vasilisa", new String[]{"мясо", "соус", "начинка"}),
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
