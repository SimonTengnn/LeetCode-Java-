package src.leetCode.greed;

public class canJump {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int destination=nums[0];
        for(int i=1;i<=destination;i++){                // 让i一直向后
            if(destination>=nums.length-1) return true; // 只要能达到的最远处destination到数组最后或者超出数组范围，就是true
            destination=Math.max(i+nums[i],destination);

        }
        return false;
    }
}
