package dynamicProgramming;

import java.util.Scanner;

public class memoizedLowestCommonSubsequence {

  public static int lcs(String s1, String s2, int m, int n, int cache[][]) {
    if (cache[m][n] != -1)
      return cache[m][n];
    if (m == 0 || n == 0) {
      cache[m][n] = 0;
      return cache[m][n];
    } else if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
      cache[m][n] = 1 + lcs(s1, s2, m - 1, n - 1, cache);
      return cache[m][n];
    }

    cache[m][n] = Math.max(lcs(s1, s2, m - 1, n, cache), lcs(s1, s2, m, n - 1, cache));
    return cache[m][n];
  }

  public static void main(String[] args) {
    String s1 = "abchile";
    String s2 = "abvpclek";
    int cache[][] = new int[s1.length() + 1][s2.length() + 1];
    for (int[] c : cache) {
      for (int i = 0; i < c.length; i++) {
        c[i] = -1;
      }
    }
    // Scanner inp = new Scanner(System.in);
    // String s1 = inp.next();
    // String s2 = inp.next();
    int ans = lcs(s1, s2, s1.length() - 1, s2.length() - 1, cache);
    System.out.print(ans);
  }
}
