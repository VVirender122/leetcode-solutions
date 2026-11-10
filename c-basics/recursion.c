// Recursion practice in C: count digits and count a character
// Time: O(n) for both, Space: O(n) for the call stack
#include <stdio.h>

// returns how many digits n has
int countDigits(int n) {
    if (n == 0) {
        return 1;
    } else if (n < 10) {
        return 1;
    } else {
        return 1 + countDigits(n / 10);
    }
}
/*
countDigits(472){
    return 1 + countDigits(47);
}
countDigits(47){
    return 1 + countDigits(4);
}
countDigits(4){
    return 1;
}
*/
// returns how many times c appears in s
int countChar(const char *s, char c) {
    // Base case: if the string is empty, return 0
    if (*s == '\0') {
        return 0;
    }
    // Recursive step: check the first character and recurse on the rest
    if (*s == c) {
        return 1 + countChar(s + 1, c);
    } else {
        return countChar(s + 1, c);
    }
}

int main() {
    printf("countDigits(0) = %d\n", countDigits(0));
    printf("countDigits(7) = %d\n", countDigits(7));
    printf("countDigits(472) = %d\n", countDigits(472));
    printf("countDigits(100000) = %d\n", countDigits(100000));

    printf("countChar(\"banana\", 'a') = %d\n", countChar("banana", 'a'));
    printf("countChar(\"banana\", 'z') = %d\n", countChar("banana", 'z'));
    printf("countChar(\"\", 'a') = %d\n", countChar("", 'a'));
    return 0;
}

/*
Stack trace of countDigits(472):
  countDigits(472) -> waits for countDigits(47)
  countDigits(47)  -> waits for countDigits(4)
  countDigits(4)   -> base case, returns 1
  countDigits(47)  -> returns 1 + 1 = 2
  countDigits(472) -> returns 1 + 2 = 3
Deepest point: 3 countDigits frames (4 with main)
*/
