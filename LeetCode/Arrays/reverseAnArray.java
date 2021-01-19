package LeetCode.Arrays;

import java.util.Scanner;

/**
 * reverseAnArray
 */
public class reverseAnArray {

  public static void reverse(int arr[]) {
    int lptr = 0, rptr = arr.length - 1;
    while (lptr < rptr) {
      int temp = arr[lptr];
      arr[lptr] = arr[rptr];
      arr[rptr] = temp;
      lptr++;
      rptr--;
    }
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int arraySize = inp.nextInt();
    int arr[] = new int[arraySize];
    for (int i = 0; i < arraySize; i++)
      arr[i] = inp.nextInt();
    reverse(arr);
    for (int i = 0; i < arraySize; i++)
      System.out.print(arr[i] + " ");
  }

}