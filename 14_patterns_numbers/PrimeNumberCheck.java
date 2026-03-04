import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: " );
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not prime");
            sc.close();
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not prime");
        sc.close();
    }
}
