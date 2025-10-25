class Solution {
    int fun(int i,int j,int [][]a,int dp[][]){
        int n = a.length;
        int m = a[0].length;
        final int INF = (int)1e9;


        if(j<0 ||j>=m) return INF;
        if(i==0)return a[0][j];
        if(dp[i][j]!=Integer.MAX_VALUE)return dp[i][j];


        int s=a[i][j]+fun(i-1,j,a,dp);
        int rd=a[i][j]+fun(i-1,j-1,a,dp);
        int ld=a[i][j]+fun(i-1,j+1,a,dp);

        return dp[i][j]= Math.min(s,Math.min(rd,ld));
    }
    public int minFallingPathSum(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int mini=Integer.MAX_VALUE;
        int[][] dp = new int[r][c];
        for (int[] row : dp) Arrays.fill(row, Integer.MAX_VALUE);
        for(int i=0;i<c;i++){
            mini=Math.min(mini,fun(r-1,i,matrix,dp));
        }
        return mini;
        
    }
}