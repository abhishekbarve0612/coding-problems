public class rotateAnArrayInPlace {

  public static int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }

  public static void main(String[] args) {
    int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 10, k = 2;
    int limit = gcd(10, 3);
    for (int i = 0; i < limit; i++) {
      int j = (i + k) % n;
      int temp = arr[i], t = i;
      while (j != i) {
        arr[t] = arr[j];
        t = j;
        j = (t + k) % n;
      }
      arr[t] = temp;
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
