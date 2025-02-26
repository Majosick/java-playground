package VegeShapes;

public class Circle2 extends Shape implements Drawable2 {

    int radius;

    public Circle2(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    //from shape
    @Override
    void draw() {

    }

    //from drawable2
    @Override
    public int somethingInFuture() {
        return 0;
    }
}