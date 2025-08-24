class Solution {
    public int longestSubarray(int[] nums) {
        int j=0;
        int max = Integer.MIN_VALUE;
        int countz = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countz++;
            }
            while(countz>1){
                if(nums[j]==0){
                    countz--;
                }
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max-1;
    }
}