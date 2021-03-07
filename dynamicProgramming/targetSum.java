
package dynamicProgramming;

import java.util.HashMap;

public class targetSum {

  public static boolean achievedSum(int total, int arr[], HashMap<Integer, Boolean> cache) {
    if (cache.containsKey(total))
      return cache.get(total);
    if (total < 0) {
      cache.put(total, false);
      return cache.get(total);
    }
    if (total == 0) {
      cache.put(total, true);
      return cache.get(total);
    }

    for (int i : arr) {
      if (achievedSum(total - i, arr, cache) == true) {
        cache.put(total - i, true);
        return cache.get(total - i);
      }

    }
    cache.put(total, false);
    return cache.get(total);
  }

  public static void main(String[] args) {
    int arr[] = new int[] { 7, 14 };
    HashMap<Integer, Boolean> hMap = new HashMap<>();
    System.out.println(achievedSum(300, arr, hMap));
  }
}
