class BSTNode {
    int key;
    BSTNode left;
    BSTNode right;

    BSTNode(int key) {
        this.key = key;
    }
}

public class BinarySearchTreeDemo {
    private BSTNode root;

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private BSTNode insertRec(BSTNode node, int key) {
        if (node == null) {
            return new BSTNode(key);
        }
        if (key < node.key) {
            node.left = insertRec(node.left, key);
        } else if (key > node.key) {
            node.right = insertRec(node.right, key);
        }
        return node;
    }

    public boolean search(int key) {
        BSTNode cur = root;
        while (cur != null) {
            if (cur.key == key) {
                return true;
            }
            cur = key < cur.key ? cur.left : cur.right;
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTreeDemo bst = new BinarySearchTreeDemo();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        System.out.println("Search 40: " + bst.search(40));
        System.out.println("Search 90: " + bst.search(90));
    }
}
