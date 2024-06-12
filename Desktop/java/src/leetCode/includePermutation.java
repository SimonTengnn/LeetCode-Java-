package src.leetCode;

import java.util.Arrays;

public class includePermutation {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int left = 0;
        int right = s1.length()-1;

        int[] time1 = new int[26]; // 存放s1字母出现个数
        int[] time2 = new int[26];

        for(int i=0;i<s1.length(); i++){
            time1[s1.charAt(i) - 'a']++;
            time2[s2.charAt(i) -'a']++;
        }

        while(right < s2.length()){
            if(Arrays.equals(time1,time2)){        // Arrays.equals判断两个数组是否内容完全一致
                return true;
            }
            // 不一致，窗口滑动， time2都让left指向的字符数-1，left往右滑动
            time2[s2.charAt(left) - 'a']--;
            left++;
            // right往右滑动，time2都让right新指向的字符数+1
            right++;
            if(left == s2.length() || right == s2.length()) return false;       // 如果right超出s2，直接返回false
            time2[s2.charAt(right) - 'a']++;
        }
        return false;
    }
}
