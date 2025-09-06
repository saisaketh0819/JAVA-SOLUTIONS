class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans =new int[2];
        int left=Left(nums,target);
        int right=Right(nums,target);
        ans[0]=left;
        ans[1]=right;
        return ans;
    }
    public int Left(int[] nums,int target){
        int l=0;
        int r=nums.length-1;
        while(l<=r){
           int mid=l+(r-l)/2;
           if(nums[mid]>=target){
            r=mid-1;
           }
           else{
            l=mid+1;
           }
        }
        if(l>=nums.length){
            return -1;
        }
        if(nums[l]!=target){
            return -1;
        }
        return l;
    }
    public int Right(int[] nums,int target){
        int l=0;
        int r=nums.length-1;
        while(l<=r){
           int mid=l+(r-l)/2;
           if(nums[mid]>target){
            r=mid-1;
           }
           else{
            l=mid+1;
           }
        }
        if(r<0){
            return -1;
        }
        if(nums[r]!=target){
            return -1;
        }
        return r;
    }
}