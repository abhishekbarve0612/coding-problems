package dynamicProgramming;

import java.util.ArrayList;

public class howSum {

  public static ArrayList<Integer> sum(int total, int arr[]) {
    ArrayList<Integer> ar = new ArrayList<>();
    if (total == 0) {
      return ar;
    }
    if (total < 0) {
      ar.clear();
      ar.add(-1);
      return ar;
    }
    for (Integer i : arr) {
      ArrayList<Integer> ar2 = sum(total - i, arr);
      if (!ar2.isEmpty() && ar2.get(0) != -1) {
        ar = ar2;
        ar.add(i);
        return ar;
      }
    }
    return ar;
  }

  public static void main(String[] args) {
    int arr[] = new int[] { 2, 3, 5 };
    ArrayList<Integer> ar = sum(8, arr);
    for (Integer integer : ar) {
      System.out.print(integer + " -- ");
    }
  }
}
