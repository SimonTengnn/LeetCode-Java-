package src.leetCode.greed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class reconstructQueue {
    public int[][] reconstructQueue(int[][] people) {
        // 1. 按身高从大到小降序排列
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] person1, int[] person2) {
                if(person1 != person2){
                    return person2[0] - person1[0];     // 按身高降序排列
                }
                else{
                    return person1[1] - person2[1];     //  身高相同时，按k升序排列
                }
            }
        });

        // 2. 将k直接插入index为k处
        List<int[]> ans = new ArrayList<>();
        for(int[] person:people){
            ans.add(person[1],person);  // 向index==person[1]处插入person这个数组
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
