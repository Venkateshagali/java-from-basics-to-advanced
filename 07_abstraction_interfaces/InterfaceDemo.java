interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class MultiFunctionDevice implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        MultiFunctionDevice mfd = new MultiFunctionDevice();
        mfd.print();
        mfd.scan();
    }
}
