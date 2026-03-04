interface Greeting {
    void say(String name);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            public void say(String name) {
                System.out.println("Hello " + name);
            }
        };

        g.say("Java");
    }
}
