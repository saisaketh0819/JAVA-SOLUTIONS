class Solution {
    public int beautySum(String s) {
        int sum = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26]; // frequency array for characters

            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;

                int max_f = 0, min_f = Integer.MAX_VALUE;
                for (int f : freq) {
                    if (f > 0) {
                        max_f = Math.max(max_f, f);
                        min_f = Math.min(min_f, f);
                    }
                }
                sum += (max_f - min_f);
            }
        }
        return sum;
    }
}
