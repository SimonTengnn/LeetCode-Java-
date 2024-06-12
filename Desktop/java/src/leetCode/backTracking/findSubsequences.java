package src.leetCode.backTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class findSubsequences {
    public List<List<Integer>> findSubsequences(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
      //  HashSet<List<Integer>> set = new HashSet<>();
        List<Integer> tmp = new ArrayList<>();
        backTracking(ans,tmp,0,nums);
        return ans;
    }

    public void backTracking(List<List<Integer>> ans,List<Integer> tmp,int startIndex,int[] nums){
       if(tmp.size()>=2) {
           ans.add(new ArrayList<>(tmp));
       }
        HashSet<Integer> set=new HashSet<>();           // 每一层用一个HashSet记录在本层使用过的数字
       for(int i=startIndex;i<nums.length;i++){
           if(!set.contains(nums[i])){      // 没取过这个数，进行操作
               if(tmp.isEmpty() || tmp.get(tmp.size()-1) <= nums[i]){
                   tmp.add(nums[i]);
                   set.add(nums[i]);
                   backTracking(ans,tmp,i+1,nums);
                   tmp.remove(tmp.size()-1);
               }
           }
        }
    }
}
