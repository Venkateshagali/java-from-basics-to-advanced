public class OptionalDemo {
    public static void main(String[] args) {
        String name = null;

        if (name == null) {
            System.out.println("Default Name");
        } else {
            System.out.println(name);
        }
    }
}
