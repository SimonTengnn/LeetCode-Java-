package src.leetCode.backTracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        boolean[] used = new boolean[nums.length];      // 外部定义一个used数组，每一个树枝上使用同一个used数组判断是否取过
        backTracking(ans,tmp,nums,used);
        return ans;
    }

    public void backTracking(List<List<Integer>> ans,List<Integer> tmp,int[] nums,boolean[] used){
        if(tmp.size() == nums.length){
            ans.add(new ArrayList<>(tmp));
            return;
        }

        for(int i =0;i<nums.length;i++){        // 每一层都从头开始，用used记录跳过谁
            if(!used[i]){   // 没有被取过
                tmp.add(nums[i]);
                used[i]=true;
                backTracking(ans,tmp,nums,used);
                tmp.remove(tmp.size()-1);
                used[i]=false;
            }
        }
    }
}
