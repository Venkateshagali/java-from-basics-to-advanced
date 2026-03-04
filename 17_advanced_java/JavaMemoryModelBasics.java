public class JavaMemoryModelBasics {
    private static int staticValue = 100;

    public static void main(String[] args) {
        int localValue = 10;
        JavaMemoryModelBasics obj = new JavaMemoryModelBasics();
        obj.show(localValue);
    }

    public void show(int value) {
        System.out.println("Local variable (stack): " + value);
        System.out.println("Static variable (method area): " + staticValue);
        System.out.println("Object field lives on heap via object reference");
    }
}
