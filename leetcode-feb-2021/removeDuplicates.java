/*
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

*/
class Solution {
  public int removeDuplicates(int[] nums) {
      if (nums.length < 2) return nums.length;
      int j = 0;
      int i = 1;
      while (i < nums.length) {
          if (nums[i] != nums[j]) {
              j++;
              nums[j] = nums[i];
          }
          i++;
      }
      return j+1;
  }
}

/*
Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}

Example:
Input: nums = [1,1,2]
Output: 2, nums = [1,2]


Given:   
Each line is whenever i or j updates
j = 0
i = 1

when i and j not the same, increase j++
every loop increase i++
exit while loop if i is not less than arr.length anymore

      0  1  1  2  2  3  3  3  4
      j  i
         j
            i
          j    i
            j  i

Update val

      0  1  2  2  2  3  3  3  4
            j  i
                  i
                     i
               j     i
        
Update val 
      0  1  2  3  2  3  3  3  4
               j     i 
                        i
                           i
                  j           i   


Update val 
      0  1  2  3  4  3  3  3  4
                  j           i   

exit while loop

return j + 1
*/
