package src.leetCode.greed;

import java.util.Arrays;
import java.util.Comparator;

public class eraseOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] time1, int[] time2) {
               return time1[1]-time2[1];        // 按照结束时间升序排列
            }
        });

        int count=0;
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int[] cur =intervals[i];
            int start=cur[0];
            if(start<end){
                count++;
                continue;       // 如果当前时间重叠被删，那end就不需要变化
            }
            end=cur[1];
        }
        return count;
    }
}
