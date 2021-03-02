package DSARevision;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedListPractice {

  public static class DNode {
    DNode prev = null;
    DNode next = null;
    int val;

    DNode(int data) {
      this.val = data;
      this.prev = null;
      this.next = null;
    }
  }

  public static class Node {
    Node next;
    int val;

    Node(int val) {
      this.val = val;
      next = null;
    }
  }

  public static int count(Node head) {
    if (head == null)
      return 0;
    return 0;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    while (head != null) {
      System.out.println(head.val);
      head = head.next;
    }
    LinkedList<Integer> ll = new LinkedList<Integer>();
    ll.add(10);
    ll.add(20);
    ll.add(30);
    Iterator<Integer> temp = ll.iterator();
    while (temp.hasNext()) {
      System.out.println(temp.next());
    }
  }
}
