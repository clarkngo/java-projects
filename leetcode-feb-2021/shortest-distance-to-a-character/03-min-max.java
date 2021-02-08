class Solution {
    public int[] shortestToChar(String s, char c) {
        // Input: s = "aaba", c = "b"
        int LEN = s.length();
        int[] ans = new int[LEN];
        int prev = Integer.MIN_VALUE / 2;
        
        // [1073741824, 1073741825, 0, 1]
        for (int i = 0; i < LEN;  i++) {
            if (s.charAt(i) == c) prev = i;
            ans[i] = i - prev;
        }
        
        // [2,1,0,1]
        // if prev initialized at 0: [2,1,0,-3]
        prev = Integer.MAX_VALUE / 2; // helps with the tail end
        for (int i = LEN - 1; i >= 0; i--) {
            if (s.charAt(i) == c) prev = i;
            ans[i] = Math.min(ans[i], prev - i);
        }
        
        return ans;
    }
}