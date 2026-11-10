// Reverse String (Easy) - LeetCode 344
// Approach: two pointers, swap the characters at both ends and move inward
// Time: O(n), Space: O(1) since it reverses in place
class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            // swap the characters at both ends
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;

            l++;
            r--;
        }
    }
}
