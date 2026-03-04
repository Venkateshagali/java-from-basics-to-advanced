import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ravi");
        names.add("Sita");
        names.add("Ajay");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
