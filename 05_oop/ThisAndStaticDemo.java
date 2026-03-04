class Employee {
    static String company = "ABC Tech";
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + company);
    }
}

public class ThisAndStaticDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ravi");
        Employee e2 = new Employee(2, "Neha");
        e1.display();
        e2.display();
    }
}
