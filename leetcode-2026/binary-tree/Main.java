import java.util.*;

class Node {
    int data;
    Node leftChild;
    Node rightChild;

    Node(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}

class BinaryTree {
    Node root;

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node firstNode = q.poll();

            if (firstNode.leftChild == null) {
                firstNode.leftChild = new Node(data);
                return;
            } else {
                q.add(firstNode.leftChild);
            }

            if (firstNode.rightChild == null) {
                firstNode.rightChild = new Node(data);
                return;
            } else {
                q.add(firstNode.rightChild);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);

        System.out.println(tree.root.rightChild.data); // Output: 15
    }
}
