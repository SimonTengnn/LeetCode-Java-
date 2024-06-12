package src.leetCode;

import java.util.Arrays;

public class triangleNumber {
        public int triangleNumber(int[] nums) {
            if(nums.length<3){
                return 0;
            }

            Arrays.sort(nums);
            int count =0;
            for(int i=1;i<nums.length-1;i++){
                for(int j=i+1;j<nums.length;j++){
                   for(int k =0; k<i;k++){
                       if(nums[k]+nums[i]>nums[j]) count++;
                   }
                }
            }
            return count;
        }
}
