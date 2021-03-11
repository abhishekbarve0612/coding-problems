package dynamicProgramming;

public class printLowestCommonSubsequence {

  public static void main(String[] args) {
    String s1 = "adebc";
    String s2 = "dcadb";
    // Scanner inp = new Scanner(System.in);
    // String s1 = inp.next();
    // String s2 = inp.next();
    int cache[][] = new int[s1.length() + 1][s2.length() + 1];
    for (int i = 1; i < s1.length() + 1; i++) {
      for (int j = 1; j < s2.length() + 1; j++) {
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
          System.out.println(
              "Inside MAtch:: ==" + s1.length() + "  " + s2.length() + "  " + cache[0].length + " " + cache.length);
          cache[i][j] = 1 + cache[i - 1][j - 1];
        } else {
          cache[i][j] = Math.max(cache[i - 1][j], cache[i][j]);
        }
      }
      for (int[] is : cache) {
        for (int is2 : is) {
          System.out.print(is2 + " ");
        }
        System.out.println();
      }
      System.out.println("--------------");
    }
    int row = s1.length(), col = s2.length();
    String s = "";
    while (row > 0 && col > 0) {
      if (s1.charAt(row - 1) == s2.charAt(col - 1)) {
        s += s1.charAt(row - 1);
        row--;
        col--;
      } else {
        if (cache[row][col - 1] > cache[row - 1][col]) {
          col--;
        } else
          row--;
      }
    }
    StringBuilder ans = new StringBuilder(s);
    ans.reverse(); // To reverse the string
    ans.toString();
    System.out.print(ans);
  }
}
