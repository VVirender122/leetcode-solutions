// Longest Substring Without Repeating Characters (Medium) - LeetCode 3
// Approach: sliding window, a map stores the last index of each character
// Time: O(n), Space: O(min(n, character set size))
import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // on a repeat, move left just past the previous occurrence (never backwards)
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }

            map.put(c, i);
            maxLen = Math.max(maxLen, i - left + 1);
        }

        return maxLen;
    }
}
