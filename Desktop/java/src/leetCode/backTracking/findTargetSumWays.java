package src.leetCode.backTracking;

public class findTargetSumWays {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {

        if(nums==null || nums.length == 0 ){
            return 0;
        }

        backTracking(nums,target,0,0);
        return count;
    }

    public void backTracking(int[] nums,int target,int sum,int index){
        if(index == nums.length){
          if(sum==target){
              count++;
          }
            return;
        }
        backTracking(nums,target,sum+nums[index],index+1);
        backTracking(nums,target,sum-nums[index],index+1);

    }
}
