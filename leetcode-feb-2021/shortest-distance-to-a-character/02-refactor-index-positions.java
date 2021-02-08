// Input: s = "loveleetcode", c = "e"
// Output: [3,2,1,0,1,0,0,1,2,2,1,0]

class Solution {
    public int[] shortestToChar(String s, char c) {
        int len = s.length();
        int[] intArr = new int[len]; // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        ArrayList<Integer> pos = new ArrayList<>();
        char[] charArr = s.toCharArray();
        
        // [1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0]
        for (int i=0; i<len; i++) {
            if (charArr[i] != c) {
                intArr[i] = 1;   
            } else {
                pos.add(i);
            }
        }
        
        
        int right = len - 1;
        int left = 0;
        int dist = pos.get(0);
        
        // scan left to first char
        // [3,2,1,0,1,0,0,1,1,1,1,0]
        for (int i=0;  i<pos.get(0); i++) {
            intArr[i] = dist;
            dist--;
            if (dist == 1) break;
        }
        
        // scan right to last char
        // [3,2,1,0,1,0,0,1,1,1,1,0]
        dist = right - pos.get(pos.size() -1);
        for (int i=len-1;  i>pos.get(pos.size() -1); i--) {
            intArr[i] = dist;
            dist--;
            if (dist == 1) break;
        }        
        
        // scan in between two chars
        // [3,2,1,0,1,0,0,1,1,1,1,0]
        int count = 2;
        int mid = 0;
        for (int i=1; i<pos.size(); i++) {
            right = pos.get(i);
            left = pos.get(i-1);
            dist = right - left;
            if (dist <= 2) continue;
            mid = (dist/2) +left;
            System.out.println(mid);
            for (int j=left+2; j<= mid; j++) {
                intArr[j] = count;
                intArr[right-count] = count;
                count++;
            }
            count = 2;
        }
        
        
        return intArr;
    }
}