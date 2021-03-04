package recursion;

public class sortArray {

  public static void arraySort(int arr[], int n) {
    if (n == 0)
      return;
    else {
      arraySort(arr, n - 1);
      int lastEle = arr[n];
      for (int i = 0; i < n; i++) {
        if (arr[n] < arr[i]) {
          int temp = n;
          while (temp > i) {
            arr[temp] = arr[temp - 1];
            temp--;
          }
          arr[temp] = lastEle;
          break;
        }
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = new int[] { 2, 3, 7, 6, 4, 5, 9 };
    arraySort(arr, arr.length - 1);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
