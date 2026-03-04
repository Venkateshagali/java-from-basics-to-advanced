import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: " );
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int rem = num % 10;
            sum += (int) Math.pow(rem, digits);
            num /= 10;
        }

        System.out.println(sum == original ? "Armstrong number" : "Not an Armstrong number");
        sc.close();
    }
}
