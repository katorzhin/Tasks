package generics;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
    void showType(){
        System.out.println("Тип Т является "+ob.getClass().getName());
    }
}
class GenDemo{
    public static void main(String[] args) {
        
    }
}