public class StringOperations {
    public static void main(String[] args) {
        String text = "Java Programming";

        System.out.println("Length: " + text.length());
        System.out.println("Upper: " + text.toUpperCase());
        System.out.println("Substring (0,4): " + text.substring(0, 4));
        System.out.println("Contains 'gram': " + text.contains("gram"));
    }
}
