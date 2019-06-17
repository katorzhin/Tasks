package generics;

public class NonGen {
    int num;

    NonGen(int i) {
        num = i;
    }

    int getNum() {
        return num;
    }
}

class Gen3<T> extends NonGen {
    T ob;

    Gen3(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

class HierDemo2 {
    public static void main(String[] args) {
        Gen3<String> w = new Gen3<>("Welcome", 47);

        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}