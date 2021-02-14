import java.util.Arrays;
public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        String s3 = s1 + s2;
        char[] charArr = s3.toCharArray();
        Arrays.sort(charArr);
        char lastChar = charArr[charArr.length-1];
        int j = 0;
        int i = 1;
      
        // keep replacing values with unique characters until 
        // you see the last character
        while (charArr[i] != lastChar) {
            if (charArr[i] != charArr[j]) {
                j++;
                charArr[j] = charArr[i];
            }
          i++;
        }
        charArr[j+1] = lastChar; // one-off
        return String.valueOf(Arrays.copyOfRange(charArr, 0, j+2));
    }
}