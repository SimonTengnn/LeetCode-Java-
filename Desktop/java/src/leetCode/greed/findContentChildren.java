package src.leetCode.greed;

import java.util.Arrays;

public class findContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        if(s==null || s.length==0){
            return count;
        }
        Arrays.sort(g);         // 排序后遍历更方便
        Arrays.sort(s);

        int end_s=s.length-1;
        for(int i=g.length-1;i>=0;i--){
            if(end_s>=0 && s[end_s]>=g[i]){     // 大饼干喂给大胃口
                count++;
                end_s--;
            }
        }

        return count;
    }
}
