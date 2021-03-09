package DSAContest;

// DSA Contest - DP - Insert Operatorby Abhishek Barve
// Insert Operator
// standard input/output: 2s/128000 kB

// You are given a sequence of numbers of size N. You have to find if there is a way to insert + or - operator in between the numbers so that the result equals K.
// Input
// The first line of input contains two integers N and K. The next line of input contains N space- separated integers depicting the values of the sequence.

// Constraints:-
// 1 <= N <= 20
// -10^15 <= K <= 10^15
// 0 <= Numbers <=10^13
// Output
// Print YES if possible else print NO.
// Example

// Sample Input:-
// 4 4
// 1 2 3 4

// Sample Output:-
// YES

// Sample Input:-
// 4 1
// 1 2 3 4

// Sample Output:-
// NO

public class insertOperator {

  public static boolean sum(int total, int arr[], int target, int ele) {
    if (ele == arr.length) {
      if (target == total)
        return true;
      return false;
    }
    return sum(total - arr[ele], arr, target, ele + 1) || sum(total + arr[ele], arr, target, ele + 1);
  }

  public static void main(String[] args) {
    int arr[] = new int[] { 1, 2, 3, 4 };
    int target = 4;
    System.out.print(sum(arr[0], arr, target, 1));
  }
}
