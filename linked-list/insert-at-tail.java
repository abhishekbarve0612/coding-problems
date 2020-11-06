/******

Given a singly linked list and an element K, your task is to insert the element at the tail of the linked list.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function addElement() that takes head node and the integer K as a parameter.

Constraints:
1 <=N<= 1000
1 <=K, value<= 1000
Output
Return the head of the modified linked list

****/

/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node addElement(Node head, int k) {
     Node temp = head;
     while(temp.next != null) temp = temp.next;
     Node newNode = new Node(k);
     temp.next = newNode;
     return head;
}