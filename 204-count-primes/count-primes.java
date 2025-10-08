class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean[] np=new boolean[n];
        Arrays.fill(np,true);
        np[0]=false;
        np[1]=false;
        int c=0;
        for(int i=2;i*i<n;i++){
            if(np[i]){
                for(int j=i*i;j<n;j+=i){
                    np[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(np[i]) c++;
        }
        return c;
    }
}