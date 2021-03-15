package LeetCode.Trees;

import java.util.*;

// 1) Create an empty stack S.
// 2) Initialize current node as root
// 3) Push the current node to S and set current = current->left until current is NULL
// 4) If current is NULL and stack is not empty then 
//      a) Pop the top item from stack.
//      b) Print the popped item, set current = popped_item->right 
//      c) Go to step 3.
// 5) If current is NULL and stack is empty then we are done.

public class inorderTraversal {

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
    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> li = new ArrayList<>();
      Stack<TreeNode> stk = new Stack<>();
      TreeNode current = root;
      while (!stk.isEmpty() || current != null) {
        while (current != null) {
          stk.push(current);
          current = current.left;
        }
        current = stk.pop();
        li.add(current.val);
        current = current.right;
      }
      return li;
    }

  }
}
