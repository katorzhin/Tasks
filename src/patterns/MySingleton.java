package patterns;

public class MySingleton {
    private MySingleton() {
        System.out.println("Singleton created!");
    }

    public static final MySingleton INSTANCE = new MySingleton();

    public void printName() {
        System.out.println("I am a Singleton");
    }
}

class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Singleton created!");
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public static LazySingleton getInstance2() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

class Test {
    public static void main(String[] args) {
//        MySingleton.INSTANCE.printName();
//        System.out.println(MySingleton.INSTANCE.getClass());
//        LazySingleton firstInstance = LazySingleton.getInstance();
//        System.out.println(firstInstance.getClass());
//        LazySingleton secondInstance = LazySingleton.getInstance();
//        System.out.println(firstInstance==secondInstance);


    }
}