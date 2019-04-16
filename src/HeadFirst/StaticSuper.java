package HeadFirst;

import java.util.Date;

public class StaticSuper {
    static {
        System.out.println("Родительский статический блок");
    }
    StaticSuper(){
        System.out.println("Родительский конструктор");
    }
}


