package stackProblems;

import java.util.ArrayList;
import java.util.Stack;

public class nextLargestElement {
  public static void main(String[] args) {
    Stack<Integer> stk = new Stack<Integer>();
    int arr[] = new int[] { 2, 3, 4, 55, 5, 67, 78 };
    ArrayList<Integer> res = new ArrayList<Integer>();
    int position = arr.length - 2;
    res.add(-1);
    while (position > -1) {
      int curr = arr[position];
      int ele = arr.length - 1;
      while (position < ele) {
        if (!stk.isEmpty() && stk.peek() < arr[ele]) {
          stk.pop();
        }
        stk.push(arr[ele]);
        ele--;
      }
      while (true) {
        if (stk.isEmpty()) {
          res.add(-1);
          break;
        } else if (stk.peek() > curr) {
          res.add(stk.pop());
          break;
        } else {
          stk.pop();
        }
      }
      stk.clear();
      position--;
    }
    for (int i = res.size() - 1; i > -1; i--) {
      System.out.println(res.get(i));
    }
  }
}
