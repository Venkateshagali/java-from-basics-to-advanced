public class WrapperClassDemo {
    public static void main(String[] args) {
        // Boxing
        Integer iObj = Integer.valueOf(25);
        Double dObj = Double.valueOf(10.5);

        // Unboxing
        int i = iObj.intValue();
        double d = dObj.doubleValue();

        // String conversion
        int parsed = Integer.parseInt("123");

        System.out.println("Integer object: " + iObj);
        System.out.println("Double object: " + dObj);
        System.out.println("Unboxed int: " + i);
        System.out.println("Unboxed double: " + d);
        System.out.println("Parsed int: " + parsed);
    }
}
