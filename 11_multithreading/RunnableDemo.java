class Task implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Running task " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task());
        t1.start();
    }
}
