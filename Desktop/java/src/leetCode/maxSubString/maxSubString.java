package src.leetCode.maxSubString;

import java.util.HashSet;
// 滑动窗口 寻找最大不重复子串
public class maxSubString {
    public static String findMax(String str){
        if(str == null || str.length() == 0){
            return null;
        }
        int maxSubStringLength = 0;
        int len=str.length();
        int left=0;
        int right =0;
        int start=0;    // 标记最大子串的起始
        int end=0;      //            结束

        HashSet<Character> hashSet = new HashSet<>();

        while(right < len){
            char current = str.charAt(right);
            if(!hashSet.contains(current)){
                hashSet.add(current);
                if(right-left+1 > maxSubStringLength){
                    maxSubStringLength=right-left+1;
                    start = left;       // 标记最大子串的起始点
                    end=right;
                }
               //  maxSubStringLength = Math.max(maxSubStringLength, right-left+1); // 要比较当前窗口和已经有的max谁大，如果现在窗口更大的话要更新max
                right++;
            }else{
                hashSet.remove(str.charAt(left));
                left++;
            }
        }

        return str.substring(start,end+1);
    }


    public static void main(String[] args) {
        String str1 = "abcdabcaba";
        System.out.println(findMax(str1));
    }
}
