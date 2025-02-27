package VegeShapes;

interface Drawable {
    int a = 9, b = 9;

    default void drawShape() {
        System.out.println("drawing shape");
    }

    void paintShape();
}
