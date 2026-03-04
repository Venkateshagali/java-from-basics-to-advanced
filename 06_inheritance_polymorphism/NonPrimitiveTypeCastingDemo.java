class AnimalBase {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends AnimalBase {
    void meow() {
        System.out.println("Meow");
    }
}

public class NonPrimitiveTypeCastingDemo {
    public static void main(String[] args) {
        // Upcasting
        AnimalBase a = new Cat();
        a.sound();

        // Downcasting
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.meow();
        }
    }
}
