package LeetCode.Arrays;

import java.util.*;

public class sortArrayOf0s1s2s {

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
    int zeros = 0, ones = 0, twos = 0;
    for (int i = 1; i < arraySize; i++) {
      switch (arr[i]) {
        case 0:
          zeros++;
          break;
        case 1:
          ones++;
          break;
        case 2:
          twos++;
          break;
      }
    }
    for (int i = 0; i < arr.length; i++) {

    }

  }

}
