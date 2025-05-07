---
Difficulty: Easy
Source: leetcode 9 Palindrome Number
Tags:
  - Math
---
**Problem :**
Given an integer x, return true if x is a palindrome, and false otherwise.
```
Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
```
--- 
## Code (Java)
```
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false ;
        }
        int n = x ;
        int revNum = 0 ;
        while(n>0){
            int d = n%10 ;
            revNum = revNum*10 + d ;
            n = n/10 ;
        }
        if(revNum == x ){
            return true ;
        }
        else{
            return false ;
        }
    }
}
```
