class Laptop {
    private String brand;
    private int ram;

    Laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    public String toString() {
        return "Laptop{brand='" + brand + "', ram=" + ram + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Laptop)) {
            return false;
        }
        Laptop other = (Laptop) obj;
        return this.ram == other.ram && this.brand.equals(other.brand);
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + brand.hashCode();
        result = 31 * result + ram;
        return result;
    }
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 16);
        Laptop l2 = new Laptop("Dell", 16);

        System.out.println(l1.toString());
        System.out.println("l1 equals l2: " + l1.equals(l2));
        System.out.println("l1 hashCode: " + l1.hashCode());
    }
}
