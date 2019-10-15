package module8;

public class Main {
    private static int peopleCount;
    private static int maxAmount;

    public static void main(String[] args)  {
        MyScanner scanner = new MyScanner();
        peopleCount = scanner.getPeopleCount();
        maxAmount = scanner.getMaxAmount();

        System.out.println("\n**************TaskLibraryOne**************\n");

        LibraryOne library = new LibraryOne(peopleCount,maxAmount);
        try {
            library.startThread();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
