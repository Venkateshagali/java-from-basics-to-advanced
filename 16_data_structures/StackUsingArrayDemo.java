public class StackUsingArrayDemo {
    private int[] arr;
    private int top;

    public StackUsingArrayDemo(int size) {
        arr = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == arr.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }

    public static void main(String[] args) {
        StackUsingArrayDemo stack = new StackUsingArrayDemo(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
