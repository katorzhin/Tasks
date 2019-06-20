import org.junit.Test;

import java.util.ArrayList;

public class MyListTest {
    @Test
    public void simpleUsage(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);


        MyList myList = new MyList();
        myList.add(10);
    }

}
