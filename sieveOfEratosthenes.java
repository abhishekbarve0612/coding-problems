public class sieveOfEratosthenes {
  public static void main(String[] args) {
    int n = 100;
    boolean primeArray[] = new boolean[n + 1];
    primeArray[0] = true;
    primeArray[1] = true;
    for (int i = 2; i * i <= n; i++) {
      if (primeArray[i] == false) {
        for (int j = i * i; j <= n; j += i) {
          primeArray[j] = true;
        }
      }
    }
    for (int i = 0; i < primeArray.length; i++) {
      if (primeArray[i] == false) {
        System.out.println(i);
      }
    }
  }

}
