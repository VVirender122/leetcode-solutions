// Binary Search (Easy) - LeetCode 704
// Approach: keep l and r pointers, compare the middle element, discard half each time
// Time: O(log n), Space: O(1)
class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            // l + (r - l) / 2 avoids integer overflow
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
