import java.util.Scanner;

public class electrostatics {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    String s = "{3,2}";
    String s2 = "{PN}";
    int n = 2;
    String newS = s.substring(1, s.length() - 1);
    String newS2 = s2.substring(1, s.length() - 1);
    String temp = "";
    int array[] = new int[newS.length()];
    int count = 0;
    for (int i = 0; i < newS.length(); i++) {
      if (newS.charAt(i) == ',') {
        array[count] = Integer.parseInt(temp);
        temp = "";
        count++;
      } else {
        temp += newS.charAt(i);
      }
    }
    array[count] = Integer.parseInt(temp);
    for (int i : array) {
      System.out.print("----" + i);
    }
    char[] ch = newS2.toCharArray();

    int count2 = 0;
    int res = 0;
    for (int a : array) {
      if (ch[count2] == ',') {
        count2++;
        continue;
      }
      if (ch[count2] == 'P') {
        res += a;
      } else {
        res += (a * -1);
      }
      count2++;
    }
    System.out.println(Math.abs(res) * 100);
  }
}
