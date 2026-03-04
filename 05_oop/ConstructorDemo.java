class Box {
    int width;
    int height;

    Box() {
        this.width = 1;
        this.height = 1;
    }

    Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int area() {
        return width * height;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5, 6);

        System.out.println("Default area: " + b1.area());
        System.out.println("Parameterized area: " + b2.area());
    }
}
