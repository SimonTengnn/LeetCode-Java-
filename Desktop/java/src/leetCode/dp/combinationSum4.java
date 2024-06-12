package src.leetCode.dp;

public class combinationSum4 {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0]=1;
        for(int j=0;j<=target;j++){         // 先背包，后物品  这样得到的是排列
            for(int i=0;i<nums.length;i++){
                if(j>=nums[i])dp[j]+=dp[j-nums[i]];     //背包容量>=物品，才能放(由于先遍历背包，第一层循环int j的时候还得不到nums[i]，因此在内层写if判断)
            }
        }
        return dp[target];
    }
}
