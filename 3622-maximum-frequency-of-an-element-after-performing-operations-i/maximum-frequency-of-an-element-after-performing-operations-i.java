class Solution {
    public int maxFrequency(int[] nums, int k, int ops) {
        Map<Integer, Integer> freq = new HashMap<>();
        int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;

        // Count frequency and find range
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }

        // Build prefix sum array
        int[] pre = new int[maxVal + 2];
        for (int i = minVal; i <= maxVal; i++) {
            pre[i] = pre[i - 1] + freq.getOrDefault(i, 0);
        }

        // Helper to get range sum [a, b]
        int ans = 0;
        for (int val = minVal; val <= maxVal; val++) {
            int base = freq.getOrDefault(val, 0);
            int left = Math.max(val - k, 1);
            int right = Math.min(val + k, maxVal);
            int band = pre[right] - pre[left - 1];
            ans = Math.max(ans, Math.min(ops + base, band));
        }

        return ans;
    }
}