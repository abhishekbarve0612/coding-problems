public class recursion {

  public static int sumofArray(int arr[], int i) {
    if (i < 0)
      return 0;
    return arr[i] + sumofArray(arr, i - 1);

  }

  public static void main(String[] args) {
    int arr[] = new int[] { 1, 3, 4, 4, 5, 6, 7 };
    int sum = sumofArray(arr, arr.length - 1);
    System.out.print(sum);
  }
}
