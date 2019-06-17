package strings;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    public String toString() {
        return "Size " + width + " on " + depth + " on " + height + ".";
    }
}

class toStringDemo {
    public static void main(String[] args) {
        Box b = new Box(10, 12, 14);
        String s = "Object type b Box: " ;
        System.out.println(b);
        System.out.println(s);
    }
}
