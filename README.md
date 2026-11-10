# LeetCode Solutions & Programming Practice

Daily problem-solving practice in C and Java, focused on Data Structures and Algorithms (DSA), pointers and string manipulation. Every solution starts with a header comment giving the approach and its time and space complexity.

LeetCode profile: [y5QpaUL44x](https://leetcode.com/u/y5QpaUL44x/)

## Contents

- [`c-basics/`](c-basics/): C fundamentals written without `<string.h>`
- [`searching/`](searching/): searching algorithms
- [`strings/`](strings/): string problems

## LeetCode (Java)

| # | Problem | Difficulty | Approach | Time | Space | Solution |
|---|---|---|---|---|---|---|
| 704 | [Binary Search](https://leetcode.com/problems/binary-search/) | Easy | Binary search | O(log n) | O(1) | [Java](searching/binary-search.java) |
| 345 | [Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/) | Easy | Two pointers | O(n) | O(n) | [Java](strings/reverse-vowels-of-a-string.java) |

## C Practice

| Program | Concepts | Time | Space | File |
|---|---|---|---|---|
| Reverse string using pointers | Pointers, string traversal, swapping | O(n) | O(1) | [C](c-basics/reverse-string-pointers.c) |
| Custom string functions | Pointers, string manipulation | See below | O(1) | [C](c-basics/string-functions.c) |

Custom string functions, written without `<string.h>`:
- `my_strlen()`: string length, O(n)
- `my_strcpy()`: copy a string, O(n)
- `my_strcmp()`: compare two strings, O(min(n, m))
- `my_strcat()`: concatenate strings, O(n + m)

## How to Run

- **C programs:** `gcc -Wall c-basics/string-functions.c -o /tmp/strfuncs && /tmp/strfuncs`
- **Java (LeetCode) files:** these contain only the `Solution` class, as LeetCode expects, so they have no `main` method. Paste them into the LeetCode editor to test.

## Roadmap

- Recursion and stack-frame tracing
- Linked lists (reverse, cycle detection, middle node)
- Sorting from scratch (bubble, selection, insertion)
- Stack and queue problems
- Java OOP practice (classes, inheritance, overriding)
- SQL problems (MySQL)

## Purpose

This repository documents my learning progress through programming exercises. I add to it regularly, with problems organised by topic and language.
