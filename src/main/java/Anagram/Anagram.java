package Anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println("Enter two words, and I'll tell you whether they are anagrams");
            String firstWord = scanner.nextLine();
            String secondWord = scanner.nextLine();
            String[] table1 = firstWord.split("");
            String[] table2 = secondWord.split("");
            Arrays.sort(table1);
            Arrays.sort(table2);
            if (Arrays.equals(table1, table2)) {
                System.out.println("They are anagrams");
            } else {
                System.out.println("They are not anagrams");
            }
            System.out.println("Do you want to enter new pair? (Y/N)");
            String input = scanner.nextLine();
            continueLoop = input.equalsIgnoreCase("Y"); // x will be true if input is "N" (case-insensitive)
        }
    }
}
