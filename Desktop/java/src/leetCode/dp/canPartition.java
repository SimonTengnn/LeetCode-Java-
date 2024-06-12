package src.leetCode.dp;

public class canPartition {
    public boolean canPartition(int[] nums) {       // 01背包实现 nums[]相当于value[]和weight[]
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2==1) return false;
        int[] dp = new int[sum/2+1];
        for(int i=0;i<nums.length;i++){
            for(int j=sum/2;j>=nums[i];j--){
                dp[j]=Math.max(dp[j],dp[j-nums[i]]+nums[i]);
            }
        }
        if(dp[sum/2]==sum/2) return true;
        return false;
    }
}
