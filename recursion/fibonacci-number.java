// Fibonacci Number (Easy) - LeetCode 509
// Approach: iterate with two variables (a, b) instead of recomputing subproblems
// Time: O(n), Space: O(1)
class Solution {
    public int fib(int n) {
        int a = 0, b = 1;
        // base cases: fib(0) = 0 and fib(1) = 1
        if (n == 0) return a;
        if (n == 1) return b;
        for (int i = 2; i <= n; i++) {
            int c = a + b; // next Fibonacci number
            a = b;
            b = c;
        }
        return b;
    }
}

/*
Plain recursive version (O(2^n) time, O(n) stack):
    public int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
It is slow because the same values are recomputed, for example fib(2) many times inside fib(5).
*/
