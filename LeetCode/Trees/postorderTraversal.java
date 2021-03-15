package LeetCode.Trees;

import java.util.*;

// 1. Push root to first stack.
// 2. Loop while first stack is not empty
//    2.1 Pop a node from first stack and push it to second stack
//    2.2 Push left and right children of the popped node to first stack
// 3. Print contents of second stack

public class postorderTraversal {

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
    public List<Integer> postorderTraversal(TreeNode root) {
      List<Integer> li = new ArrayList<>();
      Stack<TreeNode> stk1 = new Stack<>();
      Stack<TreeNode> stk2 = new Stack<>();
      if (root != null)
        stk1.push(root);
      while (!stk1.isEmpty()) {
        TreeNode temp = stk1.pop();
        stk2.push(temp);
        if (temp.left != null)
          stk1.push(temp.left);
        if (temp.right != null)
          stk1.push(temp.right);
      }
      while (!stk2.isEmpty()) {
        li.add(stk2.pop().val);
      }
      return li;
    }
  }
}
