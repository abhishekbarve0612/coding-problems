package dynamicProgramming;

import java.util.HashMap;

public class tribonacci {

  public static long trib(int n, HashMap<Integer, Long> store) {
    if (!store.containsKey(n)) {
      if (n <= 2) {
        store.put(n, (long) 0);
        return store.get(n);
      } else if (n == 3) {
        store.put(n, (long) 1);
        return store.get(n);
      } else {
        long k = trib(n - 1, store) + trib(n - 2, store) + trib(-3, store);
        store.put(n, k);
        return store.get(n);
      }
    } else {
      System.out.println("Inside Else: " + n + " --> " + store.get(n));
      return store.get(n);
    }
  }

  public static void main(String[] args) {
    HashMap<Integer, Long> store = new HashMap<Integer, Long>();
    System.out.print(trib(10, store));
  }
}
