package src.leetCode.backTracking;

import java.security.DigestInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class letterCombinations {
    public List<String> letterCombinations(String digits) {     // 排列问题
        List<String> ans = new ArrayList<>();
        List<Character> tmp = new ArrayList<>();
        if(digits == null || digits.length()==0){
            return ans;
        }
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        int len = digits.length();
        backTracking(len,ans,tmp,0,digits,map);
        return ans;
    }
    public void backTracking(int len,List<String> ans,List<Character> tmp,int index,String digits, HashMap<Character,String> map){
        if(index == len){
            StringBuilder sb = new StringBuilder();
            for(char ch:tmp){
                sb.append(ch);
            }
            ans.add(sb.toString());
            return;
        }

        for(int i=0;i<map.get(digits.charAt(index)).length();i++){
            tmp.add(map.get(digits.charAt(index)).charAt(i));       // 把digit[index]对应的字符串中第i个字符 加入tmp
            backTracking(len,ans,tmp,index+1,digits,map);     // 递归
            tmp.remove(tmp.size() -1 );                       // 回溯，去掉tmp最后一个元素
        }

    }
}
