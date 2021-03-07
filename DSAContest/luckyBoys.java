package DSAContest;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/***
 * standard input/output: 2s/128000 kB There are n boys and m toys. Your task is
 * to distribute the toys so that as many boys as possible will get a toy. Each
 * boy has a desired toy size, and they will accept any toy whose size is close
 * enough to the desired size. So if the desired toy size of a particular boy is
 * 'a' and a particular toy has size 'b', then boy will only accept the toy if
 * |b-a| <= k. Input The first input line has three integers n, m, and k: the
 * number of boys, the number of toys, and the maximum allowed difference.
 * 
 * The next line contains n integers a[1], a[2],…, a[n]: the desired toy size of
 * each boy. If the desired toy size of a boy is x, he will accept any toy whose
 * size is between x−k and x+k.
 * 
 * The last line contains m integers b[1], b[2],…, b[m]: the size of each toy
 * Constraints 1 ≤ n,m ≤ 200000 0 ≤ k ≤ 1000000000 1 ≤ a[i],b[i] ≤ 1000000000
 * Output Print one integer: the number of boys who will get a toy.
 */

// Sample Input
// 4 3 5
// 60 45 80 60
// 30 60 75

// Sample Output
// 2

// Explanation: One possible way can give second toy to first boy and third toy
// to third boy.

// Sample Input:
// 10 10 0
// 37 62 56 69 34 46 10 86 16 49
// 50 95 47 43 9 62 83 71 71 7

// Sample Output:
// 1

public class luckyBoys {

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int nBoys = inp.nextInt(), mToys = inp.nextInt(), k = inp.nextInt();
    PriorityQueue<Integer> desiredSize = new PriorityQueue<Integer>(Collections.reverseOrder());
    PriorityQueue<Integer> toySize = new PriorityQueue<Integer>(Collections.reverseOrder());
    for (int i = 0; i < nBoys; i++) {
      desiredSize.add(inp.nextInt());
    }
    for (int i = 0; i < mToys; i++) {
      toySize.add(inp.nextInt());
    }
    int counter = 0;
    while (!toySize.isEmpty() && !desiredSize.isEmpty()) {
      int ele = toySize.peek();
      if ((desiredSize.peek() - k) <= ele && ele <= (desiredSize.peek() + k)) {
        counter++;
        toySize.poll();
      }
      desiredSize.poll();
    }
    System.out.println(counter);
  }
}
