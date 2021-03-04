package recursion;

public class stringSubset {

  public static void subsets(String str1, String str2) {
    if (str1.length() == 0) {
      System.out.println(str2);
      return;
    }
    subsets(str1.substring(1), str2);
    subsets(str1.substring(1), str2 + str1.substring(0, 1));
  }

  public static void main(String[] args) {
    subsets("abc", "");
  }
}
