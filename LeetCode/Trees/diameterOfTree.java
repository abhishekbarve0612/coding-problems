package LeetCode.Trees;

public class diameterOfTree {
  public class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      left = null;
      right = null;
    }
  }

  public class Pair {
    int first, second;

    public Pair() {
      this.first = 0;
      this.second = 0;
    }

    public Pair(int x, int y) {
      this.first = x;
      this.second = y;
    }
  }

  public static int height(Node root) {
    if (root == null)
      return 0;
    return Math.max(height(root.left), height(root.right)) + 1;
  }

  public static int getDiameter(Node root) {
    if (root == null)
      return 0;
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);
    int leftDia = getDiameter(root.left), rightDia = getDiameter(root.right);
    int res = Math.max(leftDia, rightDia);
    res = Math.max(res, leftHeight + rightHeight + 1);
    return res;

  }
}
