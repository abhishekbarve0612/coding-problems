package DSAContest;

import java.util.Scanner;

public class proProduct {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n = inp.nextInt(), num1, num2;
    for (int i = 2; i < 10; i++) {
      if (n % i == 0) {
        if (n / i < 10) {
          num1 = i;
          num2 = n / i;
          if (num1 > num2) {
            System.out.print(num2 + "" + num1);
          } else {
            System.out.print(num1 + "" + num2);
          }
          break;
        }
      }
      if (i == 9) {
        System.out.print("-1");
      }
    }
  }
}
