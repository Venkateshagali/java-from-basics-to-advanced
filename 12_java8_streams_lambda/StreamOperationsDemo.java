import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamOperationsDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = new ArrayList<Integer>();

        for (Integer n : nums) {
            if (n % 2 == 0) {
                result.add(n * n);
            }
        }

        System.out.println(result);
    }
}
