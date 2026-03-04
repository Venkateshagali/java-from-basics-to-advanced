class BankAccount {
    private String holderName;
    private double balance;

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderName() {
        return holderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setHolderName("Venka");
        account.deposit(1500.0);

        System.out.println("Holder: " + account.getHolderName());
        System.out.println("Balance: " + account.getBalance());
    }
}
