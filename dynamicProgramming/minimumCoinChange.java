package dynamicProgramming;

import java.util.Scanner;

public class minimumCoinChange {

  public static int minimumChange(int sum, int coins[]) {
    int cache[][] = new int[coins.length + 1][sum + 1];
    for (int i = 1; i < coins.length + 1; i++) {
      for (int j = 1; j < sum + 1; j++) {
        if (i == 1)
          cache[i - 1][j] = Integer.MAX_VALUE - 1;
        if (coins[i - 1] <= j)
          cache[i][j] = Math.min(cache[i - 1][j], 1 + cache[i][j - coins[i - 1]]);
        else
          cache[i][j] = cache[i - 1][j];
      }
    }
    // for (int[] is : cache) {
    // for (int is2 : is) {
    // System.out.print(is2 + " ");
    // }
    // System.out.println();
    // }
    // System.out.println("-------------");

    return cache[coins.length][sum];
  }

  public static void main(String[] args) {

    int sum = 5;
    int coins[] = new int[] { 1, 6, 3 };
    int ans = minimumChange(sum, coins);
    if (ans == Integer.MAX_VALUE - 1) {
      System.out.println("Not Possible");
    } else {
      System.out.print(ans);
    }

  }
}
