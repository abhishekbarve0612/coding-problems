package stringProblems;

public class compressString {

  public static String compress(String str) {
    String s1 = "";
    int sum = 1;
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == str.charAt(i + 1))
        sum++;
      else {
        s1 = s1 + str.charAt(i) + sum;
        sum = 1;
      }
    }
    s1 = s1 + str.charAt(str.length() - 1) + sum;
    return s1;
  }

  public static void main(String[] args) {
    String s1 = "aaaabbbccd";
    System.out.println(compress(s1));
  }
}
