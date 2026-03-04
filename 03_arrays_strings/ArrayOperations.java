import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};

        int sum = 0;
        int max = numbers[0];
        for (int n : numbers) {
            sum += n;
            if (n > max) {
                max = n;
            }
        }

        Arrays.sort(numbers);

        System.out.println("Sorted: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
    }
}
