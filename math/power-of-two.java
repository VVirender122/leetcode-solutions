// Power of Two (Easy) - LeetCode 231
// Approach: a power of two has exactly one set bit, and n & (n - 1) clears the lowest set bit
// Time: O(1), Space: O(1)
class Solution {
    public boolean isPowerOfTwo(int n) {
        // n must be positive, and removing its lowest set bit must leave 0
        if (n > 0 && (n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }
}
