package dynamicProgramming;

public class unboundedKnapsackDp {

  public static int knapsack(int weights[], int profits[], int capacity, int element, int cache[][]) {
    if (cache[weights[element]][capacity] != 0) {
      if (capacity == 0 || element == -1)
        return 0;
      if (weights[element] > capacity) {
        cache[weights[element]][capacity] = knapsack(weights, profits, capacity, element - 1, cache);
        return cache[weights[element]][capacity];
      }
      cache[weights[element]][capacity] = Math.max(
          profits[element] + knapsack(weights, profits, capacity - weights[element], element, cache),
          knapsack(weights, profits, capacity, element - 1, cache));
      return cache[weights[element]][capacity];
    }
    return cache[weights[element]][capacity];
  }

  public static void main(String[] args) {
    int wts[] = new int[] { 3, 2, 4 };
    int pts[] = new int[] { 6, 8, 7 };
    int capacity = 8;
    int cache[][] = new int[wts.length + 1][capacity + 1];
    int maxProfit = knapsack(wts, pts, capacity, wts.length - 1, cache);
    System.out.print(maxProfit);
  }
}
