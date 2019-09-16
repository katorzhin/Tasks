package module7;


import module7.enumExample.DogType;

public class ExampleEnum {
    static void printType(DogType typeDog) {
        if (typeDog == DogType.dalmatian) {
            System.out.println("type is dalmatian");
        }
        if (typeDog == DogType.mops) {
            System.out.println("type is mops");
        }
        if (typeDog == DogType.shpic) {
            System.out.println("type is shpic");
        }
        if (typeDog == DogType.toozik) {
            System.out.println("type is toozik");
        }
    }

    public static void main(String[] args) {
        DogType dogType = DogType.dalmatian;
        printType(dogType);
        printType(DogType.mops);
        printType(DogType.shpic);
    }
}
