package VegeShapes;

public class Apple implements Product {

    private int cost = 9;

    @Override
    public int showCost() {
        return this.cost;
    }
}
