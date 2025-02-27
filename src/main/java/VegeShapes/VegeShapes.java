package VegeShapes;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;

public class VegeShapes {

    public static void main(String[] args) {
        // Generating a random alphanumeric string
        String randomString = RandomStringUtils.randomAlphanumeric(10);
        System.out.println("Random String: " + randomString);

        Circle c2 = new Circle(1, 2, 3);
        int interfaceValue = c2.b;
        System.out.println("interface value of c2: " + interfaceValue);
        c2.drawShape();
        int k = c2.draw();
        System.out.println(k);

        Product[] basket = new Product[5];
        basket[0] = new Carrot();
        basket[1] = new Apple();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (basket[i] != null)
                sum += basket[i].showCost();
        }
        System.out.println("cost is " + sum);

        for (Product p : basket) {
            if (p != null)
                sum += p.showCost();
        }
        System.out.println("double cost is " + sum);

        List<Product> productList = new ArrayList<>();
        productList.add(new Carrot());
        productList.add(new Apple());
        int sum2 = 0;
        for (Product p : productList) {
            sum2 += p.showCost();
        }
        System.out.println("cost is " + sum2);

        List<Object> objectList = new ArrayList<>();
        objectList.add("string");
        objectList.add(1);
        for (Object o : objectList) {
            System.out.println(o);
        }
    }
}
