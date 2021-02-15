public class segregateNegativeAndPositive {
  public static void main(String[] args) {
    int arr[] = new int[] { -2, 4, -4, 32, -5, 9, -3, -66 };
    int negativeFrame = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        int temp = arr[i];
        arr[i] = arr[negativeFrame];
        arr[negativeFrame] = temp;
        negativeFrame++;
      }
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
