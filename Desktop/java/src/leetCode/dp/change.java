package src.leetCode.dp;

public class change {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];       // 总额为j的组合方案数
        dp[0]=1;    // 总额为0 只能不拿任何硬币
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amount;j--){
                dp[j]+=dp[j-coins[i]];
            }
        }
        return dp[amount];
    }
}
