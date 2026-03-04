import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: " );
        int n = sc.nextInt();

        int original = n;
        int reverse = 0;

        while (n > 0) {
            reverse = reverse * 10 + (n % 10);
            n /= 10;
        }

        System.out.println(original == reverse ? "Palindrome number" : "Not palindrome number");
        sc.close();
    }
}
