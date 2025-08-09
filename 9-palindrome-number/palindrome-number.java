class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int d = x;
        int m = x;
        int digits = 0;
        int rev=0;
        while(x>0){
            x=x/10;
            digits++;
        }
        while(d>0){
            int s = d%10;
            d=d/10;
            rev += (int)s*(int)Math.pow(10,digits-1);
            digits--;
        }
        if(m==rev){
            return true;
        }
        else{
            return false;
        }

    }
}