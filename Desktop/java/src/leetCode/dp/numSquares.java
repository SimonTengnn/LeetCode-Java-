package src.leetCode.dp;

public class numSquares {
    public int numSquares(int n) {
        if(n==1)return 1;
        int[] dp= new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i]=Integer.MAX_VALUE;        // 由于每次背包都取最小值，因此初始化为最大值才不会被覆盖
        }

        for(int i=1;i<n;i++){
            for(int j=n;j>=i*i;j++){
                dp[j]=Math.min(dp[j],dp[j-i*i]+1);
            }
        }
        return dp[n];
    }
}
