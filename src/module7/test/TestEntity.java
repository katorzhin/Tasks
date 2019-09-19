package module7.test;

public class TestEntity {
    enum TypeCar{highback,sedan,universal,cupe}
    TypeCar typeCar;
    public String model ;
    public int mileage;

    public TestEntity(TypeCar typeCar, String model, int mileage) {
        this.typeCar = typeCar;
        this.model = model;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "typeCar=" + typeCar +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
