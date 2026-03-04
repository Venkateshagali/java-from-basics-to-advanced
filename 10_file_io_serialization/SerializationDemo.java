import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        String fileName = "person.ser";
        Person person = new Person("Riya", 23);
        ObjectOutputStream out = null;
        ObjectInputStream in = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(person);
            out.close();

            in = new ObjectInputStream(new FileInputStream(fileName));
            Person loaded = (Person) in.readObject();
            System.out.println("Name: " + loaded.name + ", Age: " + loaded.age);
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class error: " + e.getMessage());
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println("Close error: " + e.getMessage());
            }
        }
    }
}
