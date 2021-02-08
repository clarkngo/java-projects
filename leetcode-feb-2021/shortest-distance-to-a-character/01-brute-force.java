class Solution {
  public int[] shortestToChar(String s, char c) {
      int len = s.length();
      int[] intArr = new int[len];
      ArrayList<Integer> charPositions = new ArrayList<>();
      Arrays.fill(intArr, 1);
      char[] charArr = s.toCharArray();
      for (int i=0; i<len; i++) {
          if (charArr[i] == c) {
              intArr[i] = 0;
              charPositions.add(i);
          }
      }
      
      int left = charPositions.get(0) - 0;
      for (int i=0; i<len; i++) {
          intArr[i] = left;
          if (charArr[i] == c) {
              intArr[i] = left;
              break;
          }            
          left--;
      }
      int right = (len - 1) - charPositions.get(charPositions.size() - 1);
      for (int i=len-1; i>=0; i--) {
          intArr[i] = right;
          if (charArr[i] == c) {
              intArr[i] = right;
              break;
          }            
          right--;
      }        
      
      int dist = 0;
      int temp_max = 0;
      int count = 1;
      int mid = 0;
      for (int i=1; i<charPositions.size(); i++) {
          right = charPositions.get(i);
          left = charPositions.get(i-1);
          dist = right - left;
          mid =  (dist / 2)  + left;
          for (int j=left+1; j <= mid; j++) {
              intArr[j] = count;
              intArr[right-count] = count;
              count++;
              System.out.println(Arrays.toString(intArr));
          }
          count = 1;
      }
      
      return intArr;
  }
}