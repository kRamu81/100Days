```
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum =  (n* (n + 1))/2;
        int currSum = 0 ;
        for(int i=0;i<nums.length;i++){
            currSum = currSum + nums[i];
        }
        int ans = actualSum - currSum ;
        return ans ;
    }
}

```

➡️➡️➡️✌️ method:
```
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i; // Missing number found
            }
        }
        return -1; // This should never happen
    }
}
```
