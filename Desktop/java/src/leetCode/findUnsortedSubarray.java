package src.leetCode;

import java.util.Arrays;

public class findUnsortedSubarray{  // 最短无序连续子数组

    /*  1. 三组子数组拼接 (需要排序的子序列左右两侧都不需要改变)
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int start=0;
        int end=nums.length-1;
        boolean flag_start = true;
        boolean flag_end= true;

        int[] origin = new int[nums.length];
        System.arraycopy(nums,0,origin,0,nums.length);
        Arrays.sort(nums);

        for(int i=0;i<origin.length;i++){
            if(nums[i] != origin[i]){
                flag_start=false;
                break;
            }
            start++;
        }
        for(int i=origin.length-1;i>=0;i--){
            if(nums[i] != origin[i]){
                flag_end=false;
                break;
            }
            end--;
        }


        if(flag_start || flag_end) return 0;
        return (end - start  +1 );
    }
    */



}
