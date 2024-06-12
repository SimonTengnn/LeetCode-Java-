package src.leetCode.backTracking;

import java.util.ArrayList;
import java.util.List;

public class combinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>    tmp = new ArrayList<>();
        backTracking(k,n,ans,tmp,1);
        return ans;
    }

    public void backTracking(int k,int n, List<List<Integer>> ans, List<Integer> tmp,int startIndex){
        if(sum(tmp)==n && tmp.size() == k){
            ans.add(new ArrayList<>(tmp));
            return;
        }

        for(int i=startIndex;i<=9;i++){
            if(sum(tmp)>n ||tmp.size()>k)break;     // 剪枝
            tmp.add(i);
            backTracking(k,n,ans,tmp,i+1);
            tmp.remove(tmp.size()-1);
        }
    }
    public int sum(List<Integer> tmp){
        int sum=0;
        for(int num:tmp){
            sum+=num;
        }
        return sum;
    }
}
