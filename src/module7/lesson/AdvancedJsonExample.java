package module7.lesson;

import com.alibaba.fastjson.JSON;
import module7.lesson.entity.Group;
import module7.lesson.entity.User;

import java.util.ArrayList;

public class AdvancedJsonExample {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
//        users.add(new User("Tom",User.Gender.male,50));
//        users.add(new User("Marge",User.Gender.female,30));
//        users.add(new User("Mike",User.Gender.male,10));
        User user = new User("hello",User.Gender.male,26);

        Group group = new Group("Basketball team","bla bla bla",users);
        String json = JSON.toJSONString(user);

        System.out.println("\n"+json+"\n");

//        Group groupClone = JSON.parseObject(json,Group.class);
//        System.out.println(groupClone);
    }
}
