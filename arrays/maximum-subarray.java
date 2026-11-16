// Maximum Subarray (Easy) - LeetCode 53
// Approach: Kadane's Algorithm (Space-Optimized Dynamic Programming)
// Extend the current subarray if beneficial; otherwise start a new one.
// Time: O(n), Space: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Choose between extending the previous subarray or starting fresh
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Track the maximum subarray sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
