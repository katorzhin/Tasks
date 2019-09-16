package module5;

public class CarDoor {
    private boolean doorsOpened;
    private boolean windowsOpened;

    public CarDoor() {
        doorsOpened = false;
        windowsOpened = true;
    }

    public CarDoor(boolean doorsOpened, boolean windowsOpened) {
        this.doorsOpened = doorsOpened;
        this.windowsOpened = windowsOpened;
    }

    public boolean getDoorsOpened() {
        return doorsOpened;
    }

    public boolean getWindowsOpened() {
        return windowsOpened;
    }

    public void setDoorsOpened(boolean doorsOpened) {
        this.doorsOpened = doorsOpened;
    }

    public void setWindowsOpened(boolean windowsOpened) {
        this.windowsOpened = windowsOpened;
    }

    void openDoors() {
        doorsOpened = true;
    }

    void closeDoors() {
        doorsOpened = false;
    }

    void ifOpenDoors() {
        if (doorsOpened == true) {
            closeDoors();
        }
    }

    void openWindows() {
        windowsOpened = true;
    }

    void closeWindows() {
        windowsOpened = false;
    }

    public void infoMessage() {
        System.out.println("car doors " + (getDoorsOpened() ? "opened" : "closed"));
        System.out.println("car windows "+(getWindowsOpened()?"opened":"closed"));
    }

    public static void main(String[] args) {
        CarDoor carDoor = new CarDoor();
        carDoor.infoMessage();

    }


}
