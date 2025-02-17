package Calculator;

public class Calculator {

    public int divide(int number1, int number2) {
        try {
            return number1 / number2;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            System.out.println("ja sie i tak wykonam");
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        int divided = c.divide(1, 0);
//        int divided = c.divide(7, 2);
//        System.out.println(divided);
    }
}
