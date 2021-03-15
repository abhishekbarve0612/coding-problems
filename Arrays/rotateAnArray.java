package Arrays;

public class rotateAnArray {

  public static void main(String[] args) {
    int arr[] = new int[] { 1, 2, 3, 4, 5 };
    int temp = arr[0];
    int i = 1;
    while (i < arr.length) {
      arr[i - 1] = arr[i];
      i++;
    }
    arr[arr.length - 1] = temp;
    for (int j : arr) {
      System.out.print(j + " ");
    }
  }
}
