class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int ans=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                i=j+1;
            }
            else{
                ans = Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}