class Solution {
    public long maxAlternatingSum(int[] nums) {
        Integer[] temp = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        Arrays.sort(temp, (a, b) -> Integer.compare(Math.abs(a), Math.abs(b)));
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
        int n=nums.length/2;
        long negSum = 0;
        long posSum = 0;
        for(int i=0;i<n;i++){
            negSum+=(long)Math.pow(nums[i],2);
        }
        for(int i=n;i<nums.length;i++){
            posSum+=(long)Math.pow(nums[i],2);
        }
        long ans = posSum-negSum;
        return ans;
    }
}