/*******

Siddharth, a great entrepreneur, chooses a person as an intern if he/she good at maths. Thus Sid gives a simple maths problem to the candidate based on which he decides to who is gonna get the offer. Below is the description of the problem asked by Sid
Given arr A[] containing N positive integers. The task is to check whether it is possible to divide the given array into an odd number of non-empty subarrays each of odd length such that each sub-array starts and ends with an odd number. If it is possible to divide the array then print "YES" otherwise "NO".

Note: Don't forget that the complete array is also considered as a subarray
Input
The first line of each test case contains N size of array. Second-line contains N space-separated elements.

Constraints:
1 <= N <= 999999
0 <= A[i] <= 999999999
Output
Print "YES", if it is possible to divide the array. Otherwise, print "NO". Without quotes.


******/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
          Scanner inp = new Scanner(System.in);
          boolean flag = false;
          int n = inp.nextInt();
          if (n % 2 == 1) flag = true;
          
          long tempInput = inp.nextLong();
          if (flag && tempInput % 2 == 0) flag = false;
          for (int i = 1; i < n-1; i++){
              tempInput = inp.nextLong();
          }
          tempInput = inp.nextLong();
          if (flag && tempInput % 2 == 0) flag = false;
          if (flag) System.out.print("YES");
          else System.out.print("NO");
	}
}