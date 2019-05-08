package Tests.Interface.Department;

import Tests.Example.cooker.Cooker;

public class DepartmenHotDishes extends Department {
    public DepartmenHotDishes() {
        cookers = new Cooker[]{
                new Cooker("Pupkin", new String[]{"картошка", "тесто"}),
                new Cooker("Vasia", new String[]{"мясо", "соус", "начинка"})
        };
    }
}
