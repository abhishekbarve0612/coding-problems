package LeetCode.Trees;

import java.util.*;

public class levelorderTraversal {

  public static class TreeNode {
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

  public static List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> fli = new LinkedList<>();
    Queue<TreeNode> q = new LinkedList<>();
    List<Integer> li = new LinkedList<>();
    TreeNode temp = root;
    if (temp != null) {
      q.add(temp);
      q.add(null);
    }
    while (!q.isEmpty()) {
      temp = q.poll();
      if (temp != null) {
        if (temp.left != null)
          q.add(temp.left);
        if (temp.right != null)
          q.add(temp.right);
        li.add(temp.val);
      } else {
        List<Integer> nli = new LinkedList<Integer>(li);
        fli.add(nli);
        li.clear();

        if (q.isEmpty())
          break;
        q.add(null);
      }

    }
    return fli;
  }

  // [3,9,20,null,null,15,7]
  public static void main(String[] args) {
    List<List<Integer>> li = new LinkedList<>();
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

    li = levelOrder(root);

    for (List<Integer> lis : li) {
      for (Integer i : lis) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
}
