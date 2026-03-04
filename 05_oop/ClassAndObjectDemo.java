class Student {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name + ", Roll: " + rollNo);
    }
}

public class ClassAndObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Asha";
        s1.rollNo = 101;
        s1.display();
    }
}
