package quickies;

public class Quickies {

    //method that will return index of lowest element in table

    public int lowestindex(int[] table) {
        int lowestIndex = 0;
        for (int i = 1; i < table.length; i++) {
            if (table[i] < table[lowestIndex]) {
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }




    public static void main(String[] args) {

        int[] niceTable = {12,3,4,5,-333,};
        Quickies q = new Quickies();
        System.out.println(q.lowestindex(niceTable));

        //sorting
//        int lowest = Integer.MAX_VALUE;
//        int largest = Integer.MIN_VALUE;
//        int[] arrayInt = {2, 43332, 45, 22, 77, 99, 44, 444444444, -1, 753, 843, 7, 3, 6, 777};
//        int[] arrayInt2 = {2, 43332, 45, 22, 77, 99, 44, 444444444, -1, 753, 843, 7, 3, 6, 777777777};
//        for (int i : arrayInt) {
//            if (i < lowest) {
//                lowest = i;
//            }
//            if (i > largest) {
//                largest = i;
//            }
//        }
//        System.out.println(lowest + " " + largest);
//        Arrays.sort(arrayInt2);
//        System.out.println(arrayInt2[0] + " " + arrayInt2[arrayInt2.length - 1]);

        //fizz buzz
//        for (int i = 1; i < 101; i++) {
////            if (i % 15 == 0)
////                System.out.println("FizzBuzz");
////            else if (i % 5 == 0)
////                System.out.println("Buzz");
////            else if (i % 3 == 0)
////                System.out.println("Fizz");
////            else System.out.println(i);
//            String result = "";
//            if (i % 3 == 0) {
//                result += "Fizz";
//            }
//            if (i % 5 == 0) {
//                result += "Buzz";
//            }
//            System.out.println(result.isEmpty() ? String.valueOf(i) : result);
//        }


    }
}
