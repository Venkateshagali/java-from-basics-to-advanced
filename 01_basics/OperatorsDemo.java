public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Arithmetic
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational
        System.out.println("a > b : " + (a > b));
        System.out.println("a == b : " + (a == b));

        // Logical
        System.out.println("(a > 5 && b < 5): " + (a > 5 && b < 5));

        // Unary and assignment
        a++;
        b += 2;
        System.out.println("a after ++ : " + a);
        System.out.println("b after += 2 : " + b);
    }
}
