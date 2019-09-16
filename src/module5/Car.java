package module5;

public class Car {
    private String dateOfManufacture;
    private String typeOfEngine;
    private double maxSpeedCar;
    private double timeAcceleration;
    private int passengerCapacity;
    private int currentQuantityPassengersInside;
    private double currentSpeed;
    private static int MAX_DOORS = 4;
    private static int MAX_WHEELS = 5;
    private CarDoor[] carDoors = new CarDoor[MAX_DOORS];
    private CarWheel[] carWheels = new CarWheel[MAX_WHEELS];


    public Car(final String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public Car(String typeOfEngine, double maxSpeedCar, double timeAcceleration, int passengerCapacity, int currentQuantityPassengersInside, double currentSpeed) {
        this.typeOfEngine = typeOfEngine;
        this.maxSpeedCar = maxSpeedCar;
        this.timeAcceleration = timeAcceleration;
        this.passengerCapacity = passengerCapacity;
        this.currentQuantityPassengersInside = currentQuantityPassengersInside;
        this.currentSpeed = currentSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    void editCurrentSpeed(int editCurrentSpeed) {
        if (editCurrentSpeed <= maxSpeedCar && editCurrentSpeed >= 0) {
            this.currentSpeed = editCurrentSpeed;
        } else {
            System.out.println("Невозмоэно установить указанную скорость!Она не входит в промежуток от 0 до " + maxSpeedCar);
        }
    }

    void putOnePassenger() {
        if (currentQuantityPassengersInside >= passengerCapacity) {
            System.out.println("Невозможно посадить такое количество пассажиров!");
        } else {
            currentQuantityPassengersInside++;
        }
    }

    //метод для проверки присутствия пассажиров
    boolean checkPassengers() {
        return currentQuantityPassengersInside > 0;
    }

    void dropOffPassenger() {
        if (checkPassengers()) {
            currentQuantityPassengersInside--;
        } else {
            System.out.println("Невозможно высадить пассажира!Пассажиры отсутствут!");
        }

    }

    void dropOffAllPassengers() {
        if (checkPassengers()) {
            currentQuantityPassengersInside = 0;
        } else {
            System.out.println("Невозможно высадить пассажира!Пассажиры отсутствут!");
        }
    }

    public CarDoor getCarDoor(int index) {
        if (index >= 0 && index <= MAX_DOORS - 1) {
            return carDoors[index];
        } else {
            System.out.println("Дверей с таким индексом не существует!");
            return null;
        }
    }

    public CarWheel getWheel(int index) {
        if (index >= 0 && index <= MAX_WHEELS - 1) {
            return carWheels[index];
        } else {
            System.out.println("Окна с таким индексом не существует!");
            return null;
        }
    }

    void removeAllWheels() {
        for (int i = 0; i < MAX_WHEELS; i++) {
            carWheels[i] = null;
        }
        MAX_WHEELS = 0;

    }

}
