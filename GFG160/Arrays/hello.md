
Day 1 of 100 Days LeetCode Challenge

#LeetCode Problem #9 – Palindrome Number

Problem Statement:
Given an integer x, return true if x is a palindrome, and false otherwise.

---

Examples:

Example 1:
Input: x = 121
Output: true
Explanation: Reads the same forward and backward.

Example 2:
Input: x = -121
Output: false
Explanation: -121 reads as 121- in reverse.

Example 3:
Input: x = 10
Output: false
Explanation: Reverse is 01, not a palindrome.



---

Constraints:

$-2^{31} \leq x \leq 2^{31} - 1$



---

Java Solution:
```
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
```

---

Python Solution:

```def isPalindrome(x: int) -> bool:
    if x < 0:
        return False
    x_str = str(x)
    return x_str == x_str[::-1]

```



