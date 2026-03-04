final class StudentRecord {
    private final int id;
    private final String name;

    public StudentRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class ImmutableClassDemo {
    public static void main(String[] args) {
        StudentRecord record = new StudentRecord(101, "Anita");
        System.out.println(record.getId() + " " + record.getName());
    }
}
