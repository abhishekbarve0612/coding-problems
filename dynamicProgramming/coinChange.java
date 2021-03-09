package dynamicProgramming;

public class coinChange {

  public static void main(String[] args) {
    int sum = 5;
    int coins[] = new int[] { 1, 2, 3 };
    int cache[][] = new int[coins.length + 1][sum + 1];
    cache[0][0] = 1;
    for (int i = 1; i < coins.length + 1; i++) {
      for (int j = 1; j < sum + 1; j++) {
        System.out.println("i == " + i + " j == " + j);
        if (j == 1)
          cache[i][j - 1] = 1;
        if (coins[i - 1] > j)
          cache[i][j] = cache[i - 1][j];
        else {
          cache[i][j] = cache[i - 1][j] + cache[i][j - coins[i - 1]];
        }
      }
      for (int[] is : cache) {
        for (int is2 : is) {
          System.out.print(is2 + " ");
        }
        System.out.println();
      }
      System.out.println("----------------");
    }
    System.out.print(cache[coins.length][sum]);
  }
}
