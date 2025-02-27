package VegeShapes;

abstract class Shape {

    int x, y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    abstract int draw();

}
