package trees;

import java.util.Scanner;
import java.util.Stack;

public class binaryTree {
    private class Node {
        int data;
        Node left, right;
    }

    private Node root;
    private int size;

    public binaryTree() {
        this.root = takeInput(new Scanner(System.in), null, true);
    }

    public Node takeInput(Scanner s, Node parent, boolean ilc) {
        if (parent == null) {
            System.out.println("Enter Root Node Value:--");
        } else {
            if (ilc) {
                System.out.println("Enter Left Node: --");
            } else {
                System.out.println("Enter Right Node: -- ");
            }
        }
        int x = s.nextInt();
        Node n = new Node();
        n.data = x;
        System.out.println("Does the left Node exist??");
        boolean hlc = s.nextBoolean();
        if (hlc) {
            n.left = takeInput(s, n, true);
        }
        System.out.println("Does the right Node exist??");
        boolean hrc = s.nextBoolean();
        if (hrc) {
            n.right = takeInput(s, n, false);
        }

        return n;

    }

    public void inorder() {
        if (this.root == null)
            return;
        Stack<Node> stk = new Stack<Node>();
        Node current = this.root;
        while (current != null || !stk.isEmpty()) {
            while (current != null) {
                stk.push(current);
                current = current.left;
            }
            current = stk.pop();
            System.out.print(current.data + " ");
            current = current.right;
        }
    }

    public void inorderTraversal() {
        if (this.root == null)
            return;
        Stack<Node> stk = new Stack<Node>();
        Node current = this.root;
        while (current != null || !stk.isEmpty()) {
            while (current != null) {
                stk.push(current);
                current = current.left;
            }
            current = stk.pop();
            System.out.print(current.data + " ");
            current = current.right;
        }
    }

    public void traverseInorder(Node n) {
        if (n == null)
            return;
        traverseInorder(n.left);
        System.out.print(n.data + " ");
        traverseInorder(n.right);
    }

    public void traversePreorder(Node n) {
        if (n == null)
            return;
        System.out.print(n.data + " ");
        traversePreorder(n.left);
        traversePreorder(n.right);
    }

    public void traversePostorder(Node n) {
        if (n == null)
            return;
        traversePostorder(n.left);
        traversePostorder(n.right);
        System.out.print(n.data + " ");
    }

    public Node getRootNode() {
        return this.root;
    }
}
