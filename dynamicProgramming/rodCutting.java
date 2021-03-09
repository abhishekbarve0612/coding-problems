package dynamicProgramming;

public class rodCutting {
  public static void main(String[] args) {
    int rodLength = 5;
    int allowedLengths[] = new int[] { 1, 2, 3, 4 };
    int profit[] = new int[] { 2, 5, 7, 8 };
    int cache[][] = new int[allowedLengths.length + 1][rodLength + 1];
    for (int i = 1; i < allowedLengths.length + 1; i++) {
      // for (int[] is : cache) {
      // for (int is2 : is) {
      // System.out.print(is2 + " ");
      // }
      // System.out.println();
      // }
      // System.out.println("------------------");
      for (int j = 1; j < rodLength + 1; j++) {
        if (allowedLengths[i - 1] > j)
          cache[i][j] = cache[i - 1][j];
        else {
          cache[i][j] = Math.max(cache[i - 1][j], profit[i - 1] + cache[i][j - allowedLengths[i - 1]]);
        }
      }
    }
    System.out.print(cache[allowedLengths.length][rodLength]);
  }
}
