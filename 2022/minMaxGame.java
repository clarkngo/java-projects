// given a list of integers with length power of 2
// keep reducing array by checking adjacent pairs with 
//       Min if pair starts with even index and Max if pair starts with odd index
// return the single remaining number

class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
      
        if (n == 1) {
            return nums[0];
        } 
        
        int[] newNums = new int[n/2];
        
        for (int i = 0; i < n/2; i++) {
            if (i % 2 == 0) {
                newNums[i] = Math.min(nums[2*i], nums[2*i+1]);
            } else {
                newNums[i] = Math.max(nums[2*i], nums[2*i+1]);
            }
        }
        return minMaxGame(newNums);
        
    }
}
