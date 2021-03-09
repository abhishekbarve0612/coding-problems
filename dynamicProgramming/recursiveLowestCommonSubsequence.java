package dynamicProgramming;

import java.util.Scanner;

public class recursiveLowestCommonSubsequence {

  public static int lcs(String s1, String s2, int m, int n) {
    if (m == 0 || n == 0)
      return 0;
    else if (s1.charAt(m - 1) == s2.charAt(n - 1))
      return 1 + lcs(s1, s2, m - 1, n - 1);
    return Math.max(lcs(s1, s2, m - 1, n), lcs(s1, s2, m, n - 1));
  }

  public static void main(String[] args) {
    String s1 = "abchile";
    String s2 = "abvpclek";
    // Scanner inp = new Scanner(System.in);
    // String s1 = inp.next();
    // String s2 = inp.next();
    int ans = lcs(s1, s2, s1.length() - 1, s2.length() - 1);
    System.out.print(ans);
  }
}
