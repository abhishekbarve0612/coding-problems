public class largestContinuousSubArray {
  public static void main(String[] args) {
    // -2, -3, 4, -1, -2, 1, 5, -3

    int arr[] = new int[] { -2, -3, 4, -1, -2, 1, 5, -3 };

    /**
     * currentMax = 0 | maxSoFar = INT_MIN currentElement | currentMax | maxSoFar -2
     * | 0 + -2 = -2 | INT_MIN < -2 ==> -2 -3 | -2 + -3 = -5 ==> -3| -2 < -3 ==> -2
     * 4 | -3 + 4 = 1 ==> 4 | -2 < 4 ==> 4 -1 | 4 - 1 = 3 ==> 3 | 4 < 3 ==> 4 -2 | 3
     * - 2 = 1 ==> 1 | 4 < 1 ==> 4 1 | 1 + 1 = 2 ==> 2 | 4 < 2 ==> 4 5 | 2 + 5 = 7
     * ==> 7 | 4 < 7 ==> 7 -3 | 7 - 3 = 4 ==> 4 | 7 < 3 ==> 7
     */

    int currentMax = 0;
    int maxSoFar = Integer.MIN_VALUE;
    for (int currentElement : arr) {
      currentMax += currentElement;
      if (currentMax < currentElement)
        currentMax = currentElement;
      if (currentMax > maxSoFar)
        maxSoFar = currentMax;
    }
    System.out.print(maxSoFar);
  }
}
