package DSARevision;

public class bubbleSort {
  public static void main(String[] args) {
    int arr[] = new int[] { 16, 4, 233, 78, 32, 4 };
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
    boolean swapped = false;
    int endpoint = arr.length;
    do {
      swapped = false;
      for (int i = 0; i < endpoint - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          swapped = true;
        }
      }
      endpoint--;
    } while (swapped);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
