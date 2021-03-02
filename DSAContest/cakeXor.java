package DSAContest;

import java.util.Scanner;

public class cakeXor {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n = inp.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = inp.nextInt();
    }
    int brr[] = new int[n];
    for (int i = 0; i < brr.length; i++) {
      int xor = 0;
      for (int j = 0; j < arr.length; j++) {
        if (i == j)
          continue;
        xor ^= arr[j];
      }
      brr[i] = xor;
    }
    for (int i : brr) {
      System.out.print(i + " ");
    }
  }
}
