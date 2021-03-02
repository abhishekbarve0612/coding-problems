package dynamicProgramming;

import java.util.Arrays;

public class dpIterative01knapsack {
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
    int capacity = 8;
    int memorizationTable[][] = new int[maxWt + 1][capacity + 1];

    for (int i = 0; i < maxWt + 1; i++) {
      for (int[] ar : memorizationTable) {
        printArray(ar);
      }
      System.out.print(i + "--------");
      for (int j = 0; j < capacity + 1; j++) {
        if (i == 0 || j == 0)
          memorizationTable[i][j] = 0;
        else if (wts[i - 1] > j)
          memorizationTable[i][j] = memorizationTable[i - 1][j];
        else
          memorizationTable[i][j] = Math.max(memorizationTable[i - 1][j],
              pts[i - 1] + memorizationTable[i - 1][capacity - wts[i - 1]]);
      }
    }

    int maxProfit = memorizationTable[maxWt][capacity];
    System.out.print(maxProfit);
  }
}
