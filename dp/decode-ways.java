// Decode Ways (Medium) - LeetCode 91
// Approach: bottom-up DP. dp[i] is the number of ways to decode the first i characters.
// From dp[i], add dp[i - 1] if the last digit is not '0', and add dp[i - 2]
// if the last two digits form a number from 10 to 26.
// Time: O(n), Space: O(n)
class Solution {
    public int numDecodings(String s) {
        int n = s.length();

        // a string starting with 0 is invalid
        if (s.charAt(0) == '0') {
            return 0;
        }

        int[] dp = new int[n + 1];

        // base cases
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            // case 1: decode one digit
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }

            // case 2: decode two digits
            int twoDigit = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');

            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}

/*
Space-optimised version (O(1) space): keep only the last two values.
    int prev2 = 1;                    // dp[i - 2]
    int prev1 = 1;                    // dp[i - 1]
    for (int i = 2; i <= n; i++) {
        int current = 0;
        if (s.charAt(i - 1) != '0') {
            current += prev1;
        }
        int two = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
        if (two >= 10 && two <= 26) {
            current += prev2;
        }
        prev2 = prev1;
        prev1 = current;
    }
    return prev1;
*/
