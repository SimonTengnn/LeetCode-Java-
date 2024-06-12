package src.leetCode.greed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class partitionLabels {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int index;
        // 先记录每个字符的最后出现index
        for(int i=0;i<26;i++){
           index= s.lastIndexOf('a'+i);
           map.put(i,index);
        }

        int end=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            end=Math.max(map.get(ch-'a'),end);      // 看当前字符的最后出现index和end谁大 如果一直访问到end，就说明可以从这里切开字符串
            if(i==end){
                ans.add(end-start+1);
                start=end+1;
            }
        }
        return ans;
    }
}
