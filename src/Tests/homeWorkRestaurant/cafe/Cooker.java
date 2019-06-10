package tests.homeWorkRestaurant.cafe;

public class Cooker {
   private String name;
    private String[] responsibility;

    public Cooker(String name, String[] responsibility) {
        this.name = name;
        this.responsibility = responsibility;
    }

    public String addDishComponent(String component) {
        return name + " add " + component;
    }

    public String getName(){
        return name;
    }


    public String[] getResponsibility() {
        return responsibility;
    }
}




