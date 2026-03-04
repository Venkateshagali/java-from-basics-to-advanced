class Engine {
    void start() {
        System.out.println("Engine starts");
    }
}

class CarWithEngine {
    private Engine engine = new Engine();

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

public class HasARelationDemo {
    public static void main(String[] args) {
        CarWithEngine car = new CarWithEngine();
        car.drive();
    }
}
