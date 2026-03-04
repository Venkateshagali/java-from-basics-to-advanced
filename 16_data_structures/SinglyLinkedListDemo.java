class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class SinglyLinkedListDemo {
    private Node head;

    public void add(int value) {
        Node n = new Node(value);
        if (head == null) {
            head = n;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = n;
    }

    public void printList() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedListDemo list = new SinglyLinkedListDemo();
        list.add(5);
        list.add(10);
        list.add(15);
        list.printList();
    }
}
