package src.leetCode.greed;

public class wiggleMaxLength {
    public int wiggleMaxLength(int[] nums) {

        if(nums.length <=1){
            return nums.length;
        }
        if(nums.length == 2){
            if(nums[1]!=nums[0]) return 2;
            else return 1;
        }
        int count=2;
        int prediff=nums[1]-nums[0];
        int curdiff;


        for(int i=2;i<nums.length;i++){
            if(nums[i-1]!=nums[i-2])prediff=nums[i-1]-nums[i-2];
            curdiff=nums[i]-nums[i-1];
            if(prediff*curdiff<0 )count++;
        }

        if(count == 2 && nums[0]==nums[nums.length-1]) count=1;

        return count;
    }
}
