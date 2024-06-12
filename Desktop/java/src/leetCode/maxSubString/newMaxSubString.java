package src.leetCode.maxSubString;

import java.util.HashSet;

public class newMaxSubString {
    public static String findMaxSubString(String str){
        if(str == null || str==""){
            return "";
        }
        int right = 0;
        int left = 0;
        int start = 0;
        int end = 0 ;
        int maxSubStringLength = 0;
        HashSet<Character> set = new HashSet();
        while(right < str.length()){
            if(!set.contains(str.charAt(right))){
                set.add(str.charAt(right));
               if(right-left+1 > maxSubStringLength){       //更新最大子串
                   maxSubStringLength=right-left+1;
                   start=left;
                   end=right;
               }
                right++;

            }else{
                set.remove(str.charAt(right));
                left++;

            }
        }
        System.out.println("start at index: "+start);
        System.out.println("end at index:   "+end);
        return str.substring(start,end+1);
    }

    public static void main(String[] args) {
        String str = "abcdabcaba";
        System.out.println(findMaxSubString(str));
    }
}
