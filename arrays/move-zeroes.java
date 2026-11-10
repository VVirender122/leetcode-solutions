// Move Zeroes (Easy) - LeetCode 283
// Approach: two pointers, i scans every element and j marks where the next non-zero belongs
// Time: O(n), Space: O(1)
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; // next position for a non-zero element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // swap the non-zero element into position j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
