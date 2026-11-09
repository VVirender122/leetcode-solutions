// Reverse Vowels of a String (Easy) - LeetCode 345
// Approach: two pointers, move each inward to the next vowel, then swap them
// Time: O(n), Space: O(n) for the char array
class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int r = chars.length - 1;

        while (l < r) {
            // skip non-vowels from the left
            while (l < r && !isVowel(chars[l])) {
                l++;
            }
            // skip non-vowels from the right
            while (l < r && !isVowel(chars[r])) {
                r--;
            }

            // swap the two vowels
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;

            l++;
            r--;
        }
        return new String(chars);
    }

    // checks for a vowel, ignoring case
    private boolean isVowel(char c) {
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
    }
}
