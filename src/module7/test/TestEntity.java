package module7.test;

public class TestEntity {
    enum TypeCar{highback,sedan,universal,cupe}
    public int mileage;
    public String model ;
    public TypeCar typeCar;

    public TestEntity(int mileage, String model, TypeCar typeCar) {
        this.mileage = mileage;
        this.model = model;
        this.typeCar = typeCar;
    }


}
