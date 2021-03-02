package DSARevision;

public class quickSort {

  public static int partition(int arr[], int beg, int end) {
    int pivot = arr[end];
    int pIndex = beg;
    for (int i = beg; i < end; i++) {
      if (arr[i] <= pivot) {
        int temp = arr[i];
        arr[i] = arr[pIndex];
        arr[pIndex] = temp;
        pIndex++;
      }
    }
    int temp = arr[end];
    arr[end] = arr[pIndex];
    arr[pIndex] = temp;
    return pIndex;
  }

  public static void qSort(int arr[], int beg, int end) {
    if (beg >= end)
      return;
    int partitionIndex = partition(arr, beg, end);
    qSort(arr, beg, partitionIndex - 1);
    qSort(arr, partitionIndex + 1, end);
  }

  public static void main(String[] args) {
    int arr[] = new int[] { 12, 45, 23, 12, 23, 2, 1, 3, 56 };
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
    qSort(arr, 0, arr.length - 1);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

}
