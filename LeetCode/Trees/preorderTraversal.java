package LeetCode.Trees;

import java.util.*;

public class preorderTraversal {

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
      TreeNode current = root;
      List<Integer> li = new LinkedList<>();
      Stack<TreeNode> stk = new Stack<>();
      if (current != null)
        stk.push(current);
      while (!stk.isEmpty()) {
        TreeNode temp = stk.pop();
        li.add(temp.val);
        if (temp.right != null)
          stk.push(temp.right);
        if (temp.left != null)
          stk.push(temp.left);
      }
      return li;
    }
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n = inp.nextInt();
    for (int i = 0; i < n; i++) {

    }
  }
}
