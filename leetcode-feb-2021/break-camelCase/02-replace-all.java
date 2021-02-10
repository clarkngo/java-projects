import java.util.Arrays;

class Solution {
  public static String camelCase(String input) {
    // $1 in a regex refers to the first capture group - 
    // that's anything inside a pair of parentheses, in this case ([A-Z]). 
    // So the capture group will be any uppercase letters it finds. 
    // In this case it's replacing a letter like "A" with " A".
    return input.replaceAll("([A-Z])", " $1");
  }
}
