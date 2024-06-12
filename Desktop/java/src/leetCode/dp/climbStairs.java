package src.leetCode.dp;

public class climbStairs {
    int climbStairs(int n) {
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<dp.length;i++){
            int num=dp[1]+dp[2];
            dp[1]=dp[2];
            dp[2]=num;
        }
        return dp[2];
    }
}
