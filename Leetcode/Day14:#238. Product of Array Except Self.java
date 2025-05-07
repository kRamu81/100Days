class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] right = new int[n];
        int pro = 1 ;

        for(int i=n-1;i>=0;i--){
            pro = pro * nums[i];
            right[i] = pro ;
        }
        int[] ans = new int[n];
        int left = 1 ;

        for(int i=0;i<n-1;i++){
            int val = left * right[i+1];
            ans[i] = val ;
            left = left * nums[i];
        }
         ans[n-1] = left ;
         return ans ;
    }
}


➡️➡️✌️

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans =new int[n];
        for(int i=0;i<n;i++){
            ans[i]=1;
        }
        int left =1;
        for(int i=0;i<n;i++){
            ans[i] *= left;
            left *= nums[i];
        }
        int right =1;
        for(int i=n-1;i>=0;i--){
            ans[i] *= right;
            right *= nums[i];
        }
        return ans;
    }
}

