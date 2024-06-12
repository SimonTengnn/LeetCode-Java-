package src.leetCode.backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        Arrays.sort(candidates);        // 对原数组排序
        boolean[] used = new boolean[candidates.length];
        backTracking(ans, tmp, 0, 0,target,used, candidates);
        return ans;
    }
    public void backTracking(List<List<Integer>> ans,  List<Integer> tmp, int sum , int startIndex,int target, boolean[] used,int[] candidates){
        if(sum == target){
            ans.add(new ArrayList<>(tmp));
            return;
        }
        for(int i=startIndex;i<candidates.length && sum+candidates[i]<=target;i++){
            if(i>0 && candidates[i]==candidates[i-1] && used[i-1]==false  )continue;        // 树层去重，选择过的同值元素不需要再选
                                                                                        // false选的是同一层，true选的是同树枝
            sum+=candidates[i];
            tmp.add(candidates[i]);
            used[i]=true;
            backTracking(ans,tmp,sum,i+1,target,used,candidates);

             tmp.remove(tmp.size()-1);       // 回溯
            used[i]=false;
            sum-=candidates[i];
        }

    }
}
