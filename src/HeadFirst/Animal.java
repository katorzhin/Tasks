package HeadFirst;

public abstract class Animal {
    public Animal(){
        System.out.println("Create Animal");
    }
    private String name;
    public String getName(){
        return name;
    }
    public Animal(String theName){
        name=theName;
    }
}
