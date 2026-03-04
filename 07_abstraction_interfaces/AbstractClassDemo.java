abstract class Payment {
    abstract void pay(double amount);

    void receipt() {
        System.out.println("Payment completed");
    }
}

class UpiPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Payment p = new UpiPayment();
        p.pay(250.0);
        p.receipt();
    }
}
