import java.util.Scanner;

public class maxSum {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int row = inp.nextInt();
    int col = inp.nextInt();
    int arr[][] = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        arr[i][j] = inp.nextInt();
      }
    }
    int rowMax = 0, colMax = 0, sum;
    for (int i = 0; i < row; i++) {
      sum = 0;
      for (int j = 0; j < col; j++) {
        sum += arr[i][j];
      }
      if (sum > rowMax)
        rowMax = sum;
    }
    for (int i = 0; i < col; i++) {
      sum = 0;
      for (int j = 0; j < row; j++) {
        sum += arr[j][i];
      }
      if (sum > colMax)
        colMax = sum;
    }

    System.out.print(rowMax + colMax);
  }
}
