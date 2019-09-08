package tasks;

public class Test1 {

    public void drawRectangle(int height, int weight) {
        for (int i = 0; i < height; i++) {
            System.out.println();
            for (int j = 0; j < weight; j++) {
                System.out.print("+");
            }
        }
    }

    public void drawRectangle(int weight) {
        for (int i = 0; i < weight; i++) {
            System.out.println();
            for (int j = 0; j < weight; j++) {
                System.out.print("+");
            }
        }
    }

    public void getMax(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else if (a == b) {
            System.out.println(a + " = " + b);
        } else {
            System.out.println(b);
        }
    }

    public void getMax(float a, float b) {
        if (b >a ) {
            System.out.println(b);
        } else if ( b==a) {
            System.out.println(a + "=" + b);
        } else {
            System.out.println(a);
        }
    }

    void getMaxInScanner() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {

        Test1 test = new Test1();

        test.getMax(1,2);
    }
}

