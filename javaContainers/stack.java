package javaContainers;

import java.util.Iterator;
import java.util.Stack;

public class stack {
  public static void main(String[] args) {
    Stack<Integer> stk = new Stack<Integer>();
    int arr[] = new int[] { 2, 3, 4, 55, 5, 67, 78 };
    for (int i : arr) {
      stk.push(i);
    }
    Iterator i = stk.iterator();
    while (i.hasNext()) {
      System.out.println(i.next());
    }
  }
}
