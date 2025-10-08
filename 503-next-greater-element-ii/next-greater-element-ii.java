class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<nums.length;i++){ 
            for(int j=((i+1)%nums.length);j!=i;j=(j+1)%nums.length){
                if(nums[j]>nums[i]){
                    ans[i]=nums[j];
                    break;
                }
            }
        }
        return ans;
    }
}