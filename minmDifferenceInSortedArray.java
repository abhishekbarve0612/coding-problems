public class minmDifferenceInSortedArray {
  public static void main(String[] args) {
    int arr[] = new int[] { 23, 45, 67, 87, 98, 345, 765, 888, 980 };
    int key = 90;
    int answer = Integer.MAX_VALUE;
    int low = 0;
    int high = arr.length - 1;
    int mid = (low + high) / 2;
    System.out.println(low + "  " + high + " " + mid);
    while (false ==) {
      System.out.println("InsideLoop ---" + low + "  " + high + " " + mid);
      if (arr[mid] == key) {
        System.out.println("inside equal");
        answer = key;
        break;
      } else if (arr[mid] < key) {
        System.out.println("inside less");
        high = mid;
      } else {
        System.out.println("inside else");
        low = mid;
      }
      mid = (low + high) / 2;
    }
    if (answer != Integer.MAX_VALUE)
      if (Math.abs(arr[low] - key) > Math.abs(arr[high] - key)) {
        answer = arr[high];
      } else {
        answer = arr[low];
      }
    System.out.print(answer);
  }
}
