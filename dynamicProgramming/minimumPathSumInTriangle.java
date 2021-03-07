package dynamicProgramming;

import java.util.Scanner;

// Minimum path sum in triangle
// standard input/output: 2s/128000 kB

// Given a triangular structure of numbers. Find the minimum of the sum of numbers that appear on the paths starting from the top towards the base, so that on each path the next number is located directly below or below-and-one-place-to-the-right. (Given: The triangle is right-angled isosceles, with equal sides having N elements.)

// Note:-size of each row is equal to its row number.

// eg of triangular structure:-

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6
// Input
// The input line contains T, denoting the number of testcases. Each testcase contains single line i.e. N
// The next N lines contains the elements of each row in each line.

// Constraints:
// 1 <= T <= 15
// 1<= N <=50
// 1<= triangle[i][j ]<=1000 (for all 0<=i
// Output
// Output the single integer denoting the result.
// Example
// Input:
// 2
// 4
// 2
// 3 4
// 6 5 7
// 4 1 8 3
// 3
// 1
// 3 4
// 6 10 7

// Output:
// 11
// 10

// Explanation: 
// Testcase 1: The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

public class minimumPathSumInTriangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int tc = input.nextInt();
    while (tc-- > 0) {
      int nrows = input.nextInt();
      int arr[][] = new int[nrows + 1][nrows + 1];
      int ans = Integer.MAX_VALUE;
      // int sum = 0;
      // sum = input.nextInt();
      // for (int i = 1; i < arr.length; i++) {
      // minTillNow = Integer.MAX_VALUE;
      // for (int j = 0; j <= i; j++) {
      // int t = input.nextInt();
      // arr[i][j] = sum + t;
      // minTillNow = Math.min(minTillNow, arr[i][j]);
      // }
      // sum = minTillNow;
      // }
      int tempInput;
      for (int i = 1; i < nrows + 1; i++) {
        for (int j = 1; j <= i; j++) {
          tempInput = input.nextInt();
          if (j == 1) {
            arr[i][j] = arr[i - 1][j] + tempInput;
          } else if (j == i) {
            arr[i][j] = arr[i - 1][j - 1] + tempInput;
          } else {
            arr[i][j] = Math.min(arr[i - 1][j - 1] + tempInput, arr[i - 1][j] + tempInput);
          }
          if (i == nrows) {
            ans = Math.min(ans, arr[i][j]);
          }
        }
      }
      System.out.println(ans);
    }

  }
}
