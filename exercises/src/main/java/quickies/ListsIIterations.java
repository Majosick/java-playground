package quickies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListsIIterations {


    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int[] array = {12, 3, 4, 5, 3, 222, 22222, 1};
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Array \nmax: " + max + " min: " + min);
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);

        for (int i : arrayList) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Array List \nmax: " + max + " min: " + min);
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        List<Integer> immutableList = List.of(1, 23, 4, 343434, 0);

        for (int i : immutableList) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Immutable List \nmax: " + max + " min: " + min);
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 1);
        hashMap.put(12, 12);
        hashMap.put(13, 13);
        hashMap.put(121, 121);

        for (int i : hashMap.keySet()) {
            if (hashMap.get(i) < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Hash Map \nmax: " + max + " min: " + min);

    }
}
