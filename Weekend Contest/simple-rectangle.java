/*****
Given N coordinates on a two dimensional plane. Find the area of the smallest rectangle such that all the points can lie inside or on the rectangle boundary.
Note - the sides of rectangle should be parallel to x and y axis.
Input
First line of input contains N.
Next N lines contains two integers x[i] and y[i].

Constraints:
2 <= N <= 100000
0 <= x[i], y[i] <= 1000000000

Note the required rectangle will never have 0 area.
Output
Print the area of the smallest rectangle such that all the points can lie inside or on the rectangle the boundary.

*****/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main(String args[])
  {  
    Scanner inp = new Scanner(System.in);
			int n = inp.nextInt();
			long a1, a2;
			long maxX = -1, maxY = -1;
			long minX = 1000000000, minY = 1000000000;
			for (int i = 0; i < n; i++){
    			a1 = inp.nextLong();
    			if (a1 > maxX) maxX = a1;
				if (a1 < minX) minX = a1;
    			a2 = inp.nextLong();
    			if (a2 > maxY) maxY = a2;
				if (a2 < minY) minY = a2;
    		}
			System.out.print((maxX - minX) * (maxY-minY));
			
  }	
}