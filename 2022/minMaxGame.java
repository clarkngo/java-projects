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
        
        // test case: [1,3,5,2,4,8,2,2]
        // nums.length = 2^3 = 8
        // n / 2 = 4
        for (int i = 0; i < n/2; i++) {
            if (i % 2 == 0) {
                // @0: (0, 1), @2: (4,5)
                newNums[i] = Math.min(nums[2*i], nums[2*i+1]);
            } else {
                // @1: (2, 3), @3: (6,7)
                newNums[i] = Math.max(nums[2*i], nums[2*i+1]);
            }
        }
        // after 1st loop: newNums = [1,5,4,2]
        // after 2nd loop: newNums = [1,4]
        // after 3rd loop: newNums = [1]
        return minMaxGame(newNums);
        
    }
}
