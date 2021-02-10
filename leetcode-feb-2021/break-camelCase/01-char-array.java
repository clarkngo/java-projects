import java.util.ArrayList;
class Solution {
  public static String camelCase(String input) {
    String str = "";
    char[] charArr = input.toCharArray();
    for (char c: charArr) {
      if (Character.isUpperCase(c)) str += " ";
      str += Character.toString(c);
    }
    return str;
  }
}