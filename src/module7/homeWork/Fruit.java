package module7.homeWork;

public class Fruit {
    public enum TypeFruit {banana, apple, pear, plum, peach, apricot, mellon, watermelon, grapefruit, tangerine}

    public TypeFruit type;
    public int shelfLife;//<-срок годности
    public String dateOfDelivery;
    public int price;

    public Fruit(TypeFruit type, int shelfLife, String dateOfDelivery, int price) {
        this.type = type;
        this.shelfLife = shelfLife;
        this.dateOfDelivery = dateOfDelivery;
        this.price = price;
    }
}
