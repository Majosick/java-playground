import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        System.out.println("Siema, wprowadz kolejno dwa wyrazy, a powiem Ci czy to anagramy");
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        String[] table1 = firstWord.split("");
        String[] table2 = secondWord.split("");
        Arrays.sort(table1);
        Arrays.sort(table2);
        if(Arrays.equals(table1, table2)) {
            System.out.println("Dobrze");
        } else System.out.println("Zle");

    }
}
