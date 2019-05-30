public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("pet",23,"oops");
        Man man2 = new Man("pets",21,"osops");
        System.out.println(man1);
        System.out.println(man2);

        Woman woman1 = new Woman("fdsfds,",43,"dfsf");
        Woman woman2 = new Woman("sdfsd",45,"sdkfl");
        System.out.println(woman1);
        System.out.println(woman2);

    }

    //напишите тут ваш код
    public static class Man{
        String name;
        int age;
        String address;
        public Man(String name, int age,String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString() {
            return (name + " " + age + " " + address);
        }
    }
    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age,String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString() {
            return (name + " " + age + " " + address);
        }
    }
}


