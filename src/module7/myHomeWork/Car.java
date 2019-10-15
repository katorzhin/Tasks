package module7.myHomeWork;

public class Car {
    public String carBrand;
    public String model;

    public enum BodyCar {Coupe, Crossover, Hatchback, Hybrids, Pickup, Sedan}

    public BodyCar bodyCar;
    public int mileAge;
    public int yearCar;

    public Car(String carBrand, String model, BodyCar bodyCar, int mileAge, int yearCar) {
        this.carBrand = carBrand;
        this.model = model;
        this.bodyCar = bodyCar;
        this.mileAge = mileAge;
        this.yearCar = yearCar;
    }
}
