package src.leetCode.greed;

public class jump {
    public int jump(int[] nums) {
        if(nums.length == 1 ){
            return 0;
        }
        int time = 1;
        int cur_destination=nums[0];        // 当前这里能跳到的覆盖范围
        int next_destination=Integer.MIN_VALUE;               // 能跳到的各个地方的最远覆盖范围
        for(int i=1;i<=cur_destination;i++){
            next_destination=Math.max(next_destination,i+nums[i]);
            if(cur_destination >=nums.length-1) return time;
            if(i==cur_destination){
                cur_destination=next_destination;
                time++;
            }
        }
        return time;
    }
}
