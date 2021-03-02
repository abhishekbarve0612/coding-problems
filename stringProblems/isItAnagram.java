package stringProblems;

public class isItAnagram {

  public static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length())
      return false;
    int arr[] = new int[256];
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    for (char i : s1.toCharArray()) {
      arr[i]++;
    }
    for (char i : s2.toCharArray()) {
      arr[i]--;
    }
    for (int i : arr) {
      if (i != 0)
        return false;
    }
    return true;

  }

  public static void main(String[] args) {
    String s1 = "abcdab", s2 = "bbcdaa";
    System.out.print(isAnagram(s1, s2));
  }
}
