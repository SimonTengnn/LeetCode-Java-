package src.leetCode.dp;

public class uniquePaths {
    public int uniquePaths(int m, int n) {      //只能往右或者往下走
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++)dp[i][0]=1;        //第一列肯定都是1
        for(int i=0;i<m;i++)dp[0][i]=1;        //第一行肯定都是1

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];     // 只要左和上有值就可以
            }
        }
        return dp[m-1][n-1];
    }
}
