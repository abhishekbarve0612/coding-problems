package dynamicProgramming;

public class unboundedKnapsack {

  public static int knapsack(int weights[], int profits[], int capacity, int element) {
    if (capacity == 0 || element == -1)
      return 0;
    if (weights[element] > capacity)
      return knapsack(weights, profits, capacity, element - 1);
    return Math.max(profits[element] + knapsack(weights, profits, capacity - weights[element], element),
        knapsack(weights, profits, capacity, element - 1));
  }

  public static void main(String[] args) {
    int wts[] = new int[] { 3, 2, 4 };
    int pts[] = new int[] { 6, 8, 7 };
    int capacity = 8;
    int maxProfit = knapsack(wts, pts, capacity, wts.length - 1);
    System.out.print(maxProfit);
  }
}
