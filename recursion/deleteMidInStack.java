package recursion;

import java.util.Stack;

public class deleteMidInStack {

  public static void deleteMid(Stack<Integer> stk, int n, int current) {
    if (stk.empty() || n == current)
      return;
    int temp = stk.pop();
    deleteMid(stk, n, current + 1);
    if (current != n / 2)
      stk.push(temp);
  }

  public static void main(String[] args) {
    Stack<Integer> stk = new Stack<Integer>();
    for (int i = 0; i < 10; i++) {
      stk.push(i);
    }
    deleteMid(stk, stk.size(), 0);
    for (Integer i : stk) {
      System.out.print(i + " ");
    }
  }
}
