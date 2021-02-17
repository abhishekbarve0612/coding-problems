package dynamicProgramming;

import java.util.Arrays;

public class dp01knapsack {
  public static void printArray(int arr[]) {
    System.out.println();
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static int knapsack(int w[], int p[], int capacity, int element, int mtable[][]) {
    System.out.println("Called Knapsack " + capacity + " " + element);

    if (capacity == 0 || element == -1)
      return 0;
    int res;
    if (mtable[w[element]][p[element]] == -1) {
      if (w[element] > capacity)
        res = knapsack(w, p, capacity, element - 1, mtable);
      else
        res = Math.max(knapsack(w, p, capacity, element - 1, mtable),
            p[element] + knapsack(w, p, capacity - w[element], element - 1, mtable));
    } else {
      res = mtable[w[element]][p[element]];
    }
    return res;
  }

  public static void main(String[] args) {
    int wts[] = new int[] { 3, 2, 4 };
    int pts[] = new int[] { 6, 8, 7 };
    int maxWt = 0, maxP = 0;
    for (int i : pts) {
      if (i > maxP)
        maxP = i;
    }
    for (int i : wts) {
      if (i > maxWt)
        maxWt = i;
    }
    int memorizationTable[][] = new int[maxWt + 1][maxP + 1];
    for (int[] i : memorizationTable) {
      Arrays.fill(i, -1);
    }
    int capacity = 8;
    int maxProfit = knapsack(wts, pts, capacity, wts.length - 1, memorizationTable);
    System.out.print(maxProfit);
  }
}
