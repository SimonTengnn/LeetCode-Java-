package src.leetCode.dp;

public class findTargetSumWays {
    public int findTargetSumWays(int[] nums, int target) {      // 也可以用回溯，但是时间复杂度高
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if((sum-target)%2 == 1 || sum-target<0 ) return 0;     // 背包容量为(sum+target)/2 没办法装满背包
        int n=nums.length;
        int bagSize = (sum-target)/2;
        int[][] dp = new int[n+1][bagSize+1];
        dp[0][0]=1;
        for(int i=0;i<=n;i++){
            int num=nums[i-1];
            for(int j=0;j<=bagSize;j++){
                dp[i][j]=dp[i-1][j];    //   不装
                if(j>=num){
                    dp[i][j] += dp[i-1][j-num];
                }
            }
        }
        return dp[nums.length-1][(sum-target)/2];
    }

}
