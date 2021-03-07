package dynamicProgramming;

public class minimumJump {

  public static void main(String[] args) {
    int arr[] = new int[] { 1, 3, 6, 1, 0, 9 };
    int jumps[] = new int[arr.length];
    jumps[0] = 0;
    for (int i = 1; i < arr.length; i++) {
      jumps[i] = Integer.MAX_VALUE;
      for (int j = 0; j <= i; j++) {
        if (arr[j] >= i - j) {
          jumps[i] = Math.min(jumps[i], jumps[j] + 1);
        }
      }
    }
    System.out.print(jumps[jumps.length - 1]);
  }
}
