```
class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];
        int start = 0 ;
        int end = nums.length-1 ;
        int ptr = ans.length-1 ;

        while(start<=end){
            int ss = nums[start] * nums[start];
            int es = nums[end] * nums[end];
            if(ss>es){
                ans[ptr] = ss;
                start++;
            }else{
                ans[ptr] = es ;
                end--;
            }
            ptr--;
        }
        return ans ;
    }
}
```
➡️➡️➡️✌️

```
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i] = nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
```
