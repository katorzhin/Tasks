package module5;

public class CarWheel {
    private double tireState;
    private final double TIRESTATE_NEW = 1;
    private final double TIRESTATE_OLD = 0;

    public CarWheel() {

    }

    public CarWheel(double tireState) {
        this.tireState = tireState;
    }

    public double getTireState() {
        return tireState;
    }

    void changeTireOnNew() {
        tireState = TIRESTATE_NEW;
    }
    void eraseTire(){

    }
    void infoMessage(){
        System.out.println("Состояние шины: "+getTireState());
    }

    public static void main(String[] args) {
        CarWheel carWheel= new CarWheel();
        carWheel.changeTireOnNew();
        carWheel.infoMessage();
    }
}
