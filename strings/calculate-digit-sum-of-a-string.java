// Calculate Digit Sum of a String (Easy) - LeetCode 2243
// Approach: simulate the rounds. Split into groups of k digits, replace each group
// with its digit sum, and repeat while the string is longer than k.
// Time: O(n) per round, and the string shrinks each round. Space: O(n)
class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder result = new StringBuilder();

            // process one group of up to k digits at a time
            for (int i = 0; i < s.length(); i += k) {
                int sum = 0;
                for (int j = i; j < i + k && j < s.length(); j++) {
                    sum += s.charAt(j) - '0';
                }
                result.append(sum);
            }
            s = result.toString();
        }
        return s;
    }
}
