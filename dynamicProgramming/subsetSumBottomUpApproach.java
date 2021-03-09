package dynamicProgramming;

public class subsetSumBottomUpApproach {

  public static void main(String[] args) {
    int sum = 11;
    int arr[] = new int[] { 2, 3, 7, 8, 10 };
    boolean cache[][] = new boolean[arr.length + 1][sum + 1];
    for (int i = 1; i < arr.length + 1; i++) {
      for (int j = 1; j < sum + 1; j++) {
        System.out
            .println("i == " + i + " j == " + j + " cache[i][j] == " + cache[i][j] + " arr[i-1] == " + arr[i - 1]);
        if (i == 1)
          cache[i - 1][j - 1] = false;
        if (j == 1)
          cache[i - 1][j - 1] = true;
        if (j >= arr[i - 1]) {
          cache[i][j] = cache[i - 1][j] || cache[i - 1][j - arr[i - 1]];
        } else {
          cache[i][j] = cache[i - 1][j];
        }

        System.out
            .println("-->  i == " + i + " j== " + j + " cache[i][j] == " + cache[i][j] + " arr[i-1] == " + arr[i - 1]);
      }
      if (cache[i][sum] == true) {
        System.out.print(true);
        break;
      }
    }
  }
}
