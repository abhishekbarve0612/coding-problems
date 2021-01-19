package LeetCode.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KthMaxInArray {

  public static void inputArray(int arr[], int arraySize, Scanner inp) {
    for (int i = 0; i < arraySize; i++)
      arr[i] = inp.nextInt();
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
    System.out.print("\n");
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int arraySize = inp.nextInt();
    int arr[] = new int[arraySize];
    inputArray(arr, arraySize, inp);
    int k = inp.nextInt();
    Arrays.sort(arr);
    System.out.print(arr[arraySize - k]);

  }
}
