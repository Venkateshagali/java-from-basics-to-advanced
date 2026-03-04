import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: " );
        String a = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        System.out.print("Enter second word: " );
        String b = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2) ? "Anagram" : "Not anagram");
        sc.close();
    }
}
