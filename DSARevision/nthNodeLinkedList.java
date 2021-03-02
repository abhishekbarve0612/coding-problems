package DSARevision;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class nthNodeLinkedList {

  public static class Node {
    int val;
    Node next;

    Node(int x) {
      this.val = x;
      this.next = null;
    }

    public static void insert(int x, Node head) {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = new Node(x);
    }

    public void traverse(Node head) {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.val + " ");
        temp = temp.next;
      }
    }
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.insert(30, head);
    head.insert(40, head);
    head.insert(50, head);
    head.traverse(head);
  }
}
