package VegeShapes;

public class Circle extends Shape implements Drawable {

    int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    //from shape
    @Override
    int draw() {
    return 1;
    }

    //from drawable
    @Override
    public void paintShape() {

    }
}