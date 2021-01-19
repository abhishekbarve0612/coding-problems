package LeetCode.Arrays;

import java.util.Scanner;

public class minAndMaxInArray {

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
    int max = arr[0], min = arr[0];
    for (int i = 1; i < arraySize; i++) {
      if (max < arr[i])
        max = arr[i];
      if (min > arr[i])
        min = arr[i];
    }
    System.out.print("MAX: " + max + " & MIN: " + min);

  }
}
