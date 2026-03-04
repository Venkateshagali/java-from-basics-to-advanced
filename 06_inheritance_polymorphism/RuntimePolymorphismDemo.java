class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with self button");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        Vehicle v2 = new Car();
        v1.start();
        v2.start();
    }
}
