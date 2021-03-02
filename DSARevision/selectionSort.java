package DSARevision;

public class selectionSort {
  public static void main(String[] args) {
    int arr[] = new int[] { 12, 45, 23, 12, 23, 2, 1, 3, 56 };
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
    for (int i = 0; i < arr.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min])
          min = j;
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

}
