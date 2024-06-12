package src.leetCode.greed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class merge {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][];
        }

        // 按左边界升序排列
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> merged = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                // 有重叠，合并区间
                end = Math.max(end, intervals[i][1]);
            } else {
                // 没有重叠，添加新的区间并更新start和end
                merged.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        // 添加最后一个区间
        merged.add(new int[]{start, end});

        return merged.toArray(new int[merged.size()][]);
    }
}
