import VegeShapes.Apple;
import VegeShapes.Carrot;
import VegeShapes.Product;
import VegeShapes.Circle2;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;

public class VegeShapes {

    public static void main(String[] args) {
        // Generating a random alphanumeric string
        String randomString = RandomStringUtils.randomAlphanumeric(10);
        System.out.println("Random String: " + randomString);

        Circle2 c2 = new Circle2(1,2,3);
        int interfaceValue = c2.b;
        System.out.println("interface value of c2: " + interfaceValue);
        
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
    
}
