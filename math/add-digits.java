// Add Digits (Easy) - LeetCode 258
// Approach: digital root, the answer follows num % 9 (a non-zero multiple of 9 gives 9)
// Time: O(1), Space: O(1)
class Solution {
    public int addDigits(int num) {
        if (num == 0)
            return 0;
        if (num % 9 == 0)
            return 9;
        return num % 9;
    }
}

/*
Loop version (O(log n) time): repeat the digit sum until one digit remains.
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

One-line formula: return (num == 0) ? 0 : 1 + (num - 1) % 9;
*/
