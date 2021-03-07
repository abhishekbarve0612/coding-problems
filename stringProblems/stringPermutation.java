package stringProblems;

import java.util.ArrayList;

public class stringPermutation {

  public static void permute(String prefix, String suffix, ArrayList<String> res) {
    if (suffix.length() == 0)
      res.add(prefix);
    else {
      for (int i = 0; i < suffix.length(); i++) {
        permute(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i + 1), res);
      }
    }
  }

  public static void main(String[] args) {
    String s = "abcd";
    ArrayList<String> res = new ArrayList<String>();
    permute("", s, res);
    for (String string : res) {
      System.out.print(string + " ");
    }
  }
}
