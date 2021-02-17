package dynamicProgramming;

public class recursive01knapsack {
  public static void printArray(int arr[]) {
    System.out.println();
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static int knapsack(int w[], int p[], int capacity, int element) {
    System.out.println("Called Knapsack " + capacity + " " + element);
    printArray(w);
    printArray(p);
    if (capacity == 0 || element == -1)
      return 0;
    if (w[element] > capacity)
      return knapsack(w, p, capacity, element - 1);
    else
      return Math.max(knapsack(w, p, capacity, element - 1),
          p[element] + knapsack(w, p, capacity - w[element], element - 1));
  }

  public static void main(String[] args) {
    int wts[] = new int[] { 3, 2, 4 };
    int pts[] = new int[] { 6, 8, 7 };
    int capacity = 8;
    int maxProfit = knapsack(wts, pts, capacity, wts.length - 1);
    System.out.print(maxProfit);
  }
}
