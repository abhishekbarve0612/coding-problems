public class unionOfTwoSortedArrays {
  public static void main(String[] args) {
    int arr1[] = new int[] { 2, 3, 5, 7, 9, 23, 56, 78 };
    int arr2[] = new int[] { 5, 7, 23, 45, 78, 85 };
    int arr3[] = new int[arr1.length + arr2.length];
    int firstPtr = 0, secondPtr = 0, count = 0;
    while (firstPtr < arr1.length && secondPtr < arr2.length) {
      if (arr1[firstPtr] > arr2[secondPtr]) {
        arr3[count] = arr2[secondPtr];
        secondPtr++;
      } else if (arr1[firstPtr] < arr2[secondPtr]) {
        arr3[count] = arr1[firstPtr];
        firstPtr++;
      } else {
        arr3[count] = arr1[firstPtr];
        firstPtr++;
        secondPtr++;
      }
      count++;
    }
    while (firstPtr < arr1.length) {
      arr3[count] = arr1[firstPtr];
      count++;
      firstPtr++;
    }
    while (secondPtr < arr2.length) {
      arr3[count] = arr2[secondPtr];
      count++;
      secondPtr++;
    }

    for (int i : arr3) {
      System.out.print(i + " ");
    }
  }
}
