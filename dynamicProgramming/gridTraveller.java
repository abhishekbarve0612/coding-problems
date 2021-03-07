package dynamicProgramming;

import java.util.HashMap;

public class gridTraveller {

  public static long gridTravel(int row, int col, HashMap<String, Long> hmap) {
    if (hmap.containsKey(row + "-" + col))
      return hmap.get(row + "-" + col);
    if (row == 0 || col == 0) {
      hmap.put(row + "-" + col, (long) 0);
      return hmap.get(row + "-" + col);
    }

    if (row == 1 && col == 1) {
      hmap.put(row + "-" + col, (long) 1);
      return hmap.get(row + "-" + col);
    }

    long k = gridTravel(row - 1, col, hmap) + gridTravel(row, col - 1, hmap);
    hmap.put(row + "-" + col, k);
    return hmap.get(row + "-" + col);
  }

  public static void main(String[] args) {
    HashMap<String, Long> hmap = new HashMap<>();
    long ans = gridTravel(18, 18, hmap);
    System.out.print(ans);
  }
}
