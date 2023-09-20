public class Kalkulator {


    public int dividing(int number1, int number2){
        try{
            return number1/number2;
        }
        catch (Exception e){
            e.printStackTrace();
            return 0;
        }
        finally {
            System.out.println("ja sie i tak wykonam");
        }
    }

    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        k.dividing(1,0);
    }
}
