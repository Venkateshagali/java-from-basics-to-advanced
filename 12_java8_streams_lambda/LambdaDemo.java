interface Message {
    void sayHello(String name);
}

public class LambdaDemo {
    public static void main(String[] args) {
        Message msg = new Message() {
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        msg.sayHello("Java");
    }
}
