// Remove All Adjacent Duplicates In String (Easy) - LeetCode 1047
// Approach: StringBuilder as a stack, pop when the top equals the current char
// Time: O(n), Space: O(n)
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int l = sb.length() - 1;
            // l >= 0 means the stack is not empty
            if (l >= 0 && sb.charAt(l) == c) {
                sb.deleteCharAt(l);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
