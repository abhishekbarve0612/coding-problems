package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class findAllDuplicatesInArray {
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
    HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
    for (int i : arr) {
      if (hmap.containsKey(i))
        hmap.put(i, hmap.get(i) + 1);
      else
        hmap.put(i, 1);
    }

    List<Integer> list = new ArrayList<Integer>();
    for (int i : hmap.keySet()) {
      if (hmap.get(i) == 2) {
        list.add(i);
      }
    }
    System.out.print(list);
  }
}
