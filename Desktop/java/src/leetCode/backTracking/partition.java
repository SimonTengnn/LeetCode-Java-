package src.leetCode.backTracking;

import java.util.ArrayList;
import java.util.List;

public class partition {
    public List<List<String>> partition(String s) {

        List<List<String>> ans = new ArrayList<>();
        List<String> tmp = new ArrayList<>();
        backTracking(ans,tmp,0,s);
        return ans;
    }

    public void backTracking(List<List<String>> ans, List<String> tmp, int startIndex,String s ){
        if(startIndex >= s.length()){
            ans.add(new ArrayList<>(tmp));
            return;
        }
        for(int i=startIndex; i<s.length();i++){
            if(!isPalindrome(s,startIndex,i)){           // 不是回文,直接跳过
                continue;
            }else{                                      // 是回文
                tmp.add(s.substring(startIndex,i+1));
            }
            backTracking(ans,tmp,i+1,s);
            tmp.remove(tmp.size()-1);
        }
    }

    public boolean isPalindrome(String s,int start, int end){
        for(int i=start,j=end; i<j;i++,j--){
            if(s.charAt(i) != s.charAt(j))return false;
        }
        return true;
    }
}
