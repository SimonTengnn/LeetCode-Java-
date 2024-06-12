    package src.leetCode.dp;

public class bagpack01 {
    public int backpack01(int[]value, int[]weight, int volumn){
      /*        // 二维dp
        int len = value.length; // 物品总数
       int[][] dp = new int[len][volumn+1];        // dp表示，从0～i件物品 放入容量为j的背包 最大价值总和
       for(int i=0;i<len;i++){
            dp[i][0]=0;     // 背包容量为0，价值肯定就是0
        }

        for(int j=0;j<=volumn;j++){
            if(j<weight[0]) dp[0][j]=0;             // 只放0号物品，背包容量比它小，价值肯定是0
            if(j>=weight[0]) dp[0][j]=value[0];     //只放0号物品，空间够放，价值就是它的价值
        }
        for(int i=1;i<len;i++){
            for(int j=1;j<=volumn;j++){
                if(j<weight[i]) dp[i][j]=dp[i-1][j];        // 不够放
                else  dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i]]+value[i]); // 够放
                                    //不放i            放i
            }
        }
        return dp[len-1][volumn];
        */
        // 一维dp
        int len = value.length;
        int[] dp = new int[volumn+1];
        for(int i=0;i<len;i++){
            for(int j=volumn;j>=weight[i];j--){     // 一定要逆序遍历，因为在二维数组中是依靠左上角元素推出的当前元素，一维正序遍历相当于覆盖了左上角（导致统一物品放入多次）
                dp[j]=Math.max(dp[j],dp[j-weight[i]]+value[j]);
            }
        }
        return dp[volumn];
    }
}
