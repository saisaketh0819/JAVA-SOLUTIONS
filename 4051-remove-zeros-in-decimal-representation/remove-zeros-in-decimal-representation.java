class Solution {
    public long removeZeros(long n) {
        String s = n+"";
        String sh = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                sh+=s.charAt(i);
            }
        }
        long ans = Long.parseLong(sh);
        return ans;
    }
}