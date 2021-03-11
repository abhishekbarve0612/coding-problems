package dynamicProgramming;

import java.util.Scanner;

public class lowestCommonSubstring {

  public static void main(String[] args) {
    String s1 = "abcdefff", s2 = "abfcefff";
    // Scanner inp = new Scanner(System.in);
    // String s1 = inp.next(), s2 = inp.next();
    int cache[][] = new int[s1.length() + 1][s2.length() + 1];
    int max = Integer.MIN_VALUE;
    for (int i = 1; i < s1.length() + 1; i++) {
      for (int j = 1; j < s2.length() + 1; j++) {
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
          cache[i][j] = 1 + cache[i - 1][j - 1];
        } else {
          cache[i][j] = 0;
        }
        max = Math.max(max, cache[i][j]);
      }
    }

    System.out.print(max);
  }

}
