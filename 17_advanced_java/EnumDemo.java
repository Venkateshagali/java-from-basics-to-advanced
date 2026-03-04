enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

public class EnumDemo {
    public static void main(String[] args) {
        Day today = Day.WED;
        System.out.println("Today: " + today);

        for (Day d : Day.values()) {
            System.out.print(d + " ");
        }
    }
}
