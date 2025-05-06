➡️➡️🚨Two Pointers✌️:
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];

        int start = 0 ;
        int end = numbers.length-1 ;

        while(start<end){
            int sum = numbers[start] + numbers[end];

            if(sum == target){
                ans[0] = start+1 ;
                ans[1] = end+1 ;

                return ans ;
            }else if ( sum > target){
                end--;
            }else{
                start++;
            }
        }

        return ans;
    }
}


➡️➡️✌️brutefore approach:

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int n = numbers.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(numbers[i]+numbers[j]==target){
                    ans[0]=i+1;
                    ans[1]=j+1;
                    return ans;
                }
            }
        }
        return ans;

    }
}