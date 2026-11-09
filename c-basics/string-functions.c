// Custom string functions using pointers, without <string.h>
// my_strlen, my_strcpy, my_strcmp, my_strcat
#include <stdio.h>

// returns the number of characters before '\0'
int my_strlen(const char *s) {
    int len = 0;
    while (s[len] != '\0') {
        len++;
    }
    return len;
}

// copies src into dest (dest must be large enough)
char *my_strcpy(char *dest, const char *src) {
    char *original_dest = dest;
    while (*src != '\0') {
        *dest++ = *src++;
    }
    *dest = '\0'; // null-terminate the destination string
    return original_dest;
}

// returns 0 if equal, negative if a < b, positive if a > b
int my_strcmp(const char *a, const char *b) {
    while (*a && *b) {
        if (*a != *b) {
            return *a - *b;
        }
        a++;
        b++;
    }
    // one string ended: compare the terminator with the other char
    return *a - *b;
}

// appends src to the end of dest (dest must be large enough)
char *my_strcat(char *dest, const char *src) {
    char *original_dest = dest;
    while (*dest) {
        dest++; // move to the end of dest
    }
    while (*src) {
        *dest++ = *src++;
    }
    *dest = '\0'; // null-terminate the destination string
    return original_dest;
}

int main() {
    char buffer[50];

    printf("my_strlen(\"Hello\") = %d\n", my_strlen("Hello"));
    printf("my_strlen(\"\") = %d\n", my_strlen(""));

    my_strcpy(buffer, "Hello");
    printf("my_strcpy: %s\n", buffer);

    my_strcat(buffer, " World");
    printf("my_strcat: %s\n", buffer);

    buffer[0] = '\0'; // empty destination
    my_strcat(buffer, "abc");
    printf("my_strcat on empty: %s\n", buffer);

    printf("equal: %d\n", my_strcmp("abc", "abc"));
    printf("less: %d\n", my_strcmp("Hello", "World"));
    printf("prefix: %d\n", my_strcmp("abc", "abcd"));
    printf("greater: %d\n", my_strcmp("b", "a"));

    return 0;
}
