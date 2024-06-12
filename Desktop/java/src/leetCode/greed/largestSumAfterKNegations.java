package src.leetCode.greed;

import java.util.Arrays;

public class largestSumAfterKNegations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum =0;
        Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
           if(k>0 && nums[i]<0){
               nums[i] = -nums[i];
               k--;
               continue;
           }
           break;       // 已经没有k或者已经到正数了，不需要再处理
       }


       Arrays.sort(nums);
       if(k>0){     // k可能有剩
           if(k%2 ==1){     // 还要反转一次最小值
               nums[0]=-nums[0];
           }
       }
       for(int num:nums){
           sum+=num;
       }

        return sum;
    }
}
