package src.leetCode.backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class permuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        Arrays.sort(nums);      // 排序用于数层去重
        boolean[] used = new boolean[nums.length];
        backTracking(ans, tmp, nums,used);
        return ans;
    }

    public void backTracking(List<List<Integer>> ans, List<Integer> tmp, int[] nums,boolean[] used) {       // 同一层看使用过没
        if (tmp.size() == nums.length) {
            ans.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]) {           // 树层去重
                continue;
            }
            if(!used[i]){   // 树枝去重：同一次递归中选择过的元素不能再选
                tmp.add(nums[i]);
                used[i]=true;
                backTracking(ans, tmp, nums, used);
                tmp.remove(tmp.size() - 1);
                used[i]=false;
            }
        }
    }
}


