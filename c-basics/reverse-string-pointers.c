// Reverse a string using pointers, without <string.h>
// Approach: count the length manually, then swap characters from both ends
// Time: O(n), Space: O(1)
#include <stdio.h>

void reverseString(char *str) {
    int length = 0;
    // count the characters manually, like strlen
    while (str[length] != '\0') {
        length++;
    }

    // swap the first half with the second half
    for (int i = 0; i < length / 2; i++) {
        char temp = *(str + i);
        *(str + i) = *(str + length - 1 - i);
        *(str + length - 1 - i) = temp;
    }
}

int main() {
    char str[100];

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);

    // fgets keeps the newline, so remove it BEFORE reversing
    for (int i = 0; str[i] != '\0'; i++) {
        if (str[i] == '\n') {
            str[i] = '\0';
            break;
        }
    }

    printf("You entered: %s\n", str);
    reverseString(str);
    printf("Reversed string: %s\n", str);
    return 0;
}
