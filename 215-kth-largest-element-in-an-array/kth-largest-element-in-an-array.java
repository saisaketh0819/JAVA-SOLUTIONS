public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int ans=0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            minHeap.offer(nums[i]);
        }
        for(int i=0;i<k;i++){
            ans=minHeap.poll();
        }
        return ans;
    }
}