package src.leetCode;

import java.util.Arrays;

public class findLHS {
    public int findLHS(int[] nums) {            // 元素顺序不影响取子序列（可以不连续）
        if(nums.length == 1){
            return 0;
        }
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int maxLength = 0;
        while (right<nums.length){
            if(nums[right]-nums[left] >1){
                left++;
            }
            if(nums[right]-nums[left] == 1){
                maxLength = Math.max(maxLength,right-left+1);
            }
            right++;
        }

        return maxLength;
    }
}
