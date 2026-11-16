// Pow(x, n) (Medium) - LeetCode 50
// Approach: binary exponentiation, square x each step and multiply it in when the current bit of n is 1
// Time: O(log n), Space: O(1)
class Solution {
    public double myPow(double x, int n) {
        // long avoids overflow: -Integer.MIN_VALUE does not fit in an int
        long power = n;
        if (power < 0) {
            power = -power;
        }
        double result = 1.0;
        while (power > 0) {
            // the lowest bit is 1, so this power of x is part of the answer
            if ((power & 1) == 1) {
                result *= x;
            }
            x *= x;
            power >>= 1;
        }
        if (n < 0) {
            return 1.0 / result;
        }
        return result;
    }
}
