import java.util.ArrayList;
import java.util.List;

public class Carrot implements Product {

    private int cost = 8;

    public static void main(String[] args) {

//        Circle2 cos = new Circle2(1,2,3);
//        int yyz = cos.z;
//        System.out.println(yyz);
//        int k = cos.draw2();
        Product[] Basket = new Product[5];
        Basket[0] = new Carrot();
        Basket[1] = new Apple();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (Basket[i] != null)
            sum += Basket[i].showCost();
        }
        //System.out.println("koszt wynosi " + sum);


        List<Product> lista = new ArrayList<>();
        lista.add(new Carrot());
        lista.add(new Apple());
        int sum2=0;
        for(Product p : lista){
            sum2 += p.showCost();
        }
        //System.out.println("koszt wynosi " + sum);


        List<Object> lst = new ArrayList<>();
        lst.add("dupa");
        lst.add(1);
        System.out.println(lst.get(0));
    }

    @Override
    public int showCost() {
        return this.cost;
    }
}


abstract class Shape {

    int x, y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void draw();

    int draw2() {
        return x ;
    }
}


class Circle2 extends Shape implements Drawablee{
    int radius;

    Circle2(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    void draw() {

    }

    @Override
    public int drawy() {
        return this.z;
    }
}

interface Drawablee {
    int z = 9,y = 9;


    int drawy();
}

