package src.leetCode.backTracking;

import java.util.ArrayList;
import java.util.List;

public class combine {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        backTracking(n,k,ans,tmp,1);
        return ans;
    }

    public void backTracking(int n,int k,List<List<Integer>> ans,List<Integer> tmp,int startIndex){
        if(tmp.size() == k){
            ans.add(new ArrayList<>(tmp));  // 不能直接add(tmp)，否则传递的是引用，后续所有对tmp的影响会影响所有已插入的元素
            // new ArrayList<>(tmp) 创建一个和tmp值完全相同的副本
            return;
        }
        for(int i=startIndex;i<=n;i++){
            if(n-i+1<k-tmp.size())break;    // 剪枝
            tmp.add(i);     // 处理
            backTracking(n,k,ans,tmp,i+1);          // 取到i，就必须往更大的数取，避免出现重复
            tmp.remove(tmp.size()-1);
        }
    }
}
