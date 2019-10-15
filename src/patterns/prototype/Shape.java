package patterns.prototype;

import java.util.Objects;

public abstract class Shape {
    int x;
    int y;
    String color;

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                "}\n";
    }

    public Shape() {
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Shape)) return false;
        Shape shape = (Shape) object;
        return shape.x == x && shape.y == y && Objects.equals(shape.color, color);
    }

    public abstract Shape clone();

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }

    }
}

class Circle extends Shape {
    int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Circle) || !super.equals(object)) return false;
        Circle shape = (Circle) object;
        return shape.radius == radius;
    }
}
