class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int key:hm.keySet()){
            if(hm.get(key)%k==0){
                sum+=key*hm.get(key);
            }
        }
        return sum;
    }
}