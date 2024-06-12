package src.leetCode.backTracking;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        if(nums==null || nums.length==0){
            return ans;
        }

        backTracking(ans,tmp,0,nums);
        ans.add(new ArrayList<>()); // 空集
        return ans;
    }

    public void backTracking( List<List<Integer>> ans,List<Integer> tmp,int startIndex,int[] nums){
        if(startIndex >= nums.length){      // 由于是要获取所有子集，因此向ans插入tmp的行为每一次拿到新的nums[i]都要执行
            return;
        }
        for(int i=startIndex;i<nums.length;i++){
            tmp.add(nums[i]);
            ans.add(new ArrayList<>(tmp));
            backTracking(ans,tmp,i+1,nums);
            tmp.remove(tmp.size()-1);
        }
    }
}
