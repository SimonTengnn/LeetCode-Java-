package src.leetCode.greed;

public class maxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int mount=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            mount+=nums[i];
            if(mount>max)max=mount;
            if(mount<0)mount=0;             // 贪心 当前子数组和=mount+nums[i]      如果mount<0，还不如只算nums[i]
        }
        return max;
    }
}
