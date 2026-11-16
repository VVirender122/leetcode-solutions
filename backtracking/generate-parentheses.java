// Generate Parentheses (Medium) - LeetCode 22
// Approach: Backtracking, track remaining opening and closing parentheses
// Time: O(n * C_n), Space: O(n) auxiliary, excluding output
// C_n = nth Catalan number

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backtrack(new StringBuilder(), n, n);
        return result;
    }

    private void backtrack(StringBuilder current, int o, int c) {
        // Base condition: all parentheses have been used
        if (o == 0 && c == 0) {
            result.add(current.toString());
            return;
        }

        // Choice 1: Add opening parenthesis
        if (o > 0) {
            current.append('(');
            backtrack(current, o - 1, c);
            current.deleteCharAt(current.length() - 1);
        }

        // Choice 2: Add closing parenthesis
        // Closing parentheses cannot exceed opening parentheses used
        if (c > o) {
            current.append(')');
            backtrack(current, o, c - 1);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
