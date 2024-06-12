package src.leetCode.dp;

public class lastStonneWeightII {
    public int lastStoneWeightII(int[] stones) {        // 分成两堆，尽可能凑成sum/2
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        int target = sum / 2;           // sum/2向下取整，如果sum是奇数，target=sum/2小于sum的一半,那么dp[target]<=sum-dp[target]
        int[] dp = new int[target+1];
        for (int i = 0; i < stones.length; i++) {
            for (int j = target; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }

        return sum-dp[target] -dp[target];          // 一共是sum，分成两堆，一堆重量是dp[target]，另一堆就是sum-dp[target]
    }
}
