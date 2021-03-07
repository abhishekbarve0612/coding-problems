package stringProblems;

public class longestCommonSubstring {

  public static void main(String[] args) {
    String s1 = "abab", s2 = "baba";
    int arr[][] = new int[s1.length() + 1][s2.length() + 1];
    String res = "";
    if (s1.length() == 0 || s2.length() == 0) {
      System.out.print(res);
    } else {
      for (int i = 1; i < s1.length() + 1; i++) {
        for (int j = 1; j < s2.length() + 1; j++) {
          if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            arr[i][j] = arr[i - 1][j - 1] + 1;
          }
          if (arr[i][j] > res.length()) {
            res = s1.substring(i - arr[i][j], i);
          }
        }
      }
    }

    System.out.println("    a  b  a  b");
    for (int[] ar : arr) {
      for (int i : ar) {
        System.out.print(i + "  ");
      }
      System.out.println();
    }
    System.out.println(res);
  }
}
