
import java.util.Collections;
import java.util.PriorityQueue;

public class kthMaxUsingPriorityQueue {
  public static void main(String[] args) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int arr[] = new int[] { 2, 43, 232, 45, 232, 234, 323, 45, 23 };
    int k = 2;
    for (int i : arr) {
      maxHeap.add(i);
      minHeap.add(i);
    }
    while (k-- > 0) {
      maxHeap.remove();
      minHeap.remove();
    }
    System.out.print(maxHeap.peek() + "  " + minHeap.peek());
  }
}
