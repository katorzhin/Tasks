package Tests.Example.department.impl;

import Tests.Example.department.Department;
import Tests.Example.menu.Dish;
import Tests.Example.menu.MenuComponents;
import Tests.Example.menu.MenuPoint;
import Tests.Example.cooker.Cooker;

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
