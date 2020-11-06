/*****

Given a linked list consisting of N nodes, your task is to check if the given list is circular or not.

Note:Examples in Sample Input and Output just shows how a linked list will look like depending on the questions. Do not copy-paste as it is in custom input
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function check() that takes head node as parameter.

Constraints:
1 <=N <= 1000
1 <= Node.data<= 1000
Output
Return 1 if the given linked list is circular else return 0.

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

public static int check(Node head) {
    Node temp = head;
    while (temp.next != null){
        if (temp.next == head) return 1;
        temp = temp.next;
    }
    return 0;
}