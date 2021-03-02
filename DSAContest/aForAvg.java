package DSAContest;

import java.util.Arrays;
import java.util.Scanner;

public class aForAvg {

  public static int checkSum(int arr[], int sum) {
    int counter = 0;
    int tsum;
    for (int i = 0; i < arr.length; i++) {
      tsum = 0;
      int j = i;
      while (j < arr.length && tsum <= sum) {
        tsum += arr[j];
        j++;
      }
      if (tsum == sum) {
        counter++;
        while (j < arr.length - 1 && arr[j] == arr[j + 1]) {
          j++;
          counter++;
        }
      }
    }
    return counter;
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int N = inp.nextInt(), A = inp.nextInt();
    int arr[] = new int[N];
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = inp.nextInt();
      sum += arr[i];
    }
    Arrays.sort(arr);
    int prod = A * N;
    int count = 0;
    if (prod == sum)
      count++;
    System.out.println(count);
    while (prod > 0) {
      prod -= N;
      int diff = sum - prod;
      count += checkSum(arr, diff);
      System.out.println(count);
    }
    System.out.print(count);
  }
}
