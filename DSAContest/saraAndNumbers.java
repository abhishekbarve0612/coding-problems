package DSAContest;

import java.util.Scanner;

public class saraAndNumbers {

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int A = inp.nextInt();
    int B = inp.nextInt();
    int C = 0;
    if (B > A) {
      C = 0;
    } else if (A == B) {
      C = -1;
    } else {
      int temp = A - B;
      while (temp > 0) {
        C++;
        temp /= 2;
      }
      if (Math.sqrt(A - B) * Math.sqrt(A - B) == (A - B))
        C--;
    }
    System.out.print(C);
  }
}
