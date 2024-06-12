package src.leetCode.dp;


public class uniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n =obstacleGrid[0].length;
        int[][] dp =new int[m][n];
        for(int i=0;i<m;i++){
            if(obstacleGrid[i][0]==1)break;     // 遇到障碍物，那一格和以后的格子都走不到了
            else dp[i][0]=1;
        }
        for(int i=0;i<n;i++){
            if(obstacleGrid[0][i]==1)break;
            else dp[0][i]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j] == 0)dp[i][j]=dp[i-1][j]+dp[i][j-1];
                else dp[i][j]=0;        // 遇到障碍物，到该格子的路径数为0
            }
        }
        return dp[m-1][n-1];
    }
}

