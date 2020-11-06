/*****

A contest setter wants to determine the time limits for a given problem. There are n model solutions, and solution k takes tk milliseconds to run on the test data. The contest setter wants the time limit to be an integer number of seconds, and wants the time limit to be at least s times larger than the slowest model solution. Compute the minimum time limit the contest setter can set.
Input
The first line of input contains two space-separated integers n and s (1 ≤ n ≤ 100 and 1 ≤ s ≤ 20).
The second line of input contains n space-separated integers t1, . . . , tn (1 ≤ tk ≤ 2000 for all
k = 1, . . . , n).
Output
Print, on one line, the minimum time limit (in seconds) as a single integer.

****/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.Scanner;
import java.lang.Math;
// don't change the name of this class
// you can add inner classes if needed
class Main {

	public static int[] quickSort(int arr[], int start, int end)
	{
		if (start < end){
				int pivot = createPivot(arr, start, end);
				quickSort(arr, start, pivot-1);
				quickSort(arr, pivot+1, end);
		}
		return arr;
		
	}

	public static int createPivot(int arr[], int start, int end){
		int pivot = arr[end];
		int guard1 = start-1;
		for (int guard2 = start; guard2 < end; guard2++){
				if (arr[guard2] < pivot){
					guard1++;
					int temp = arr[guard1];
					arr[guard1] = arr[guard2];
					arr[guard2] = temp;
				}
		}
		int temp = arr[guard1+1];
		arr[guard1+1] = pivot;
		arr[end] = temp;
		return guard1+1;
	}

	public static void inputArray(int arr[], Scanner inp){
		for (int i = 0; i < arr.length; i++){
			arr[i] = inp.nextInt();
		}
	}
	public static void printArray(int arr[]){
		for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
	}
	public static void main (String[] args) {
			Scanner inp = new Scanner(System.in);
			int n = inp.nextInt();
			int arr[] = new int[n];
			int s = inp.nextInt();
			inputArray(arr, inp);
			quickSort(arr, 0, n-1);
			double slowest = (double)arr[n-1];
			double ans = slowest * s /1000;
			System.out.print((int)Math.ceil(ans));
	}
}