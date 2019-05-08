package Tests.Example.department.impl;

import Tests.Example.cooker.Cooker;
import Tests.Example.department.Department;
import Tests.Example.menu.Dish;
import Tests.Example.menu.MenuComponents;
import Tests.Example.menu.MenuPoint;

public class ColdDepartment extends Department {
    public ColdDepartment() {
        this.cookers = new Cooker[]{
                new Cooker("Vasiliy", new String[]{"паста", "салат", "сало", "селедка", "заправка"}),
                new Cooker("Inna", new String[]{"соус", "свинец", "огурцы", "водка"}),
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

