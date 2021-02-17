import java.util.Scanner;

public class rotateAString {

  public static int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    String s = inp.nextLine();
    String[] swords = s.split(" ");
    char arr[] = new char[s.length()];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = s.charAt(i);
    }
    int k = inp.nextInt();
    int n = s.length();
    int limit = gcd(n, k);
    for (int i = 0; i < limit; i++) {
      int j = (i + k) % n;
      char temp = arr[i];
      int t = i;
      while (j != i) {
        arr[t] = arr[j];
        t = j;
        j = (t + k) % n;
      }
      arr[t] = temp;
    }
    String str2 = String.valueOf(arr);
    String[] str2words = str2.split(" ");
    int count = 0;
    for (String string : str2words) {
      for (String string2 : swords) {
        if (string.equals(string2))
          count++;
      }
    }
    System.out.print(count);
  }
}
