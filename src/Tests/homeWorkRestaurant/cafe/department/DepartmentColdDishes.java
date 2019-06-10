package tests.homeWorkRestaurant.cafe.department;

import tests.example.cooker.Cooker;

public class DepartmentColdDishes extends Department {
    public DepartmentColdDishes() {
        cookers = new Cooker[]{
                new Cooker("Sveta", new String[]{"филе лосося", "соевый соус", "сок лимонный"}),
                new Cooker("Violetta", new String[]{"руккола", "овощи", "мед", "хлеб"})
        };
    }
}
