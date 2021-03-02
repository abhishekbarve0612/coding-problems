package DSARevision;

public class insertionSort {
  public static void main(String[] args) {
    int arr[] = new int[] { 12, 45, 23, 12, 23, 2, 1, 3, 56 };
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
    int currentValue, hole;
    for (int i = 1; i < arr.length; i++) {
      currentValue = arr[i];
      hole = i;
      while (hole > 0 && arr[hole - 1] > currentValue) {
        arr[hole] = arr[hole - 1];
        hole--;
      }
      arr[hole] = currentValue;
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
