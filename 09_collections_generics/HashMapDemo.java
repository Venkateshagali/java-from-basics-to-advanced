import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<Integer, String>();
        students.put(101, "Asha");
        students.put(102, "Kiran");

        System.out.println(students.get(101));
        System.out.println(students);
    }
}
