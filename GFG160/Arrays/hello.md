# Day 1 of 100 Days LeetCode Challenge

## LeetCode Problem #9 – Palindrome Number

**Problem Statement:**  
Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

---

## Examples

- **Example 1:**  
  **Input:** `x = 121`  
  **Output:** `true`  
  **Explanation:** 121 reads as 121 from left to right and from right to left.

- **Example 2:**  
  **Input:** `x = -121`  
  **Output:** `false`  
  **Explanation:** From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

- **Example 3:**  
  **Input:** `x = 10`  
  **Output:** `false`  
  **Explanation:** Reads 01 from right to left. Therefore it is not a palindrome.

---

## Constraints

- $-2^{31} \leq x \leq 2^{31} - 1$

---

## Java Solution

```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int n = x;
        int revNum = 0;

        while (n > 0) {
            int d = n % 10;
            revNum = revNum * 10 + d;
            n = n / 10;
        }

        return revNum == x;
    }
}