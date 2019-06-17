package generics;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}
class Gen22<T>extends Gen<T>{
    Gen22(T o ){
        super(o);
    }
}
class HierDemo3{
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);

        Gen22<Integer> iOb2 = new Gen22<>(99);
        Gen<Long>iOb3= new Gen<>(3555555555563666853L);

        Gen22<String>strOb2 = new Gen22<>("Generalization test");

        if (iOb2 instanceof Gen22<?>){
            System.out.println("Object iob2 is an instance of the class Gen22 ");
        }
        if (iOb2 instanceof Gen<?>){
            System.out.println("Object is an instance of the class Gen");
        }
        if (strOb2 instanceof Gen22<?>){
            System.out.println("Object strOb2 is an instance of the class Gen22 ");
        }
        if (strOb2 instanceof Gen<?>){
            System.out.println("Object is an instance of the class Gen");
        }
        System.out.println();

        if (iOb instanceof Gen22<?>){
            System.out.println("Object iob is an instance of the class Gen22 ");
        }
        if (iOb instanceof Gen<?>){
            System.out.println("Object is an instance of the class Gen");
        }

    }
}