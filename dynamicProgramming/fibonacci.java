package dynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;

public class fibonacci {

  public static long fib(int n, HashMap<Integer, Long> store) {
    if (!store.containsKey(n)) {
      if (n <= 2) {
        store.put(n, (long) 1);
        return store.get(n);
      } else {
        long k = fib(n - 1, store) + fib(n - 2, store);
        store.put(n, k);
        return store.get(n);
      }
    } else {
      System.out.println("Inside Else: " + store.get(n));
      return store.get(n);
    }
  }

  public static void main(String[] args) {
    HashMap<Integer, Long> store = new HashMap<Integer, Long>();
    System.out.print(fib(50, store));
  }
}
