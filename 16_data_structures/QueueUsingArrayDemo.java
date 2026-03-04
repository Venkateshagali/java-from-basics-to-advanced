public class QueueUsingArrayDemo {
    private int[] arr;
    private int front;
    private int rear;

    public QueueUsingArrayDemo(int size) {
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear == arr.length - 1) {
            System.out.println("Queue overflow");
            return;
        }
        arr[++rear] = value;
    }

    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue underflow");
            return -1;
        }
        return arr[front++];
    }

    public static void main(String[] args) {
        QueueUsingArrayDemo queue = new QueueUsingArrayDemo(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
