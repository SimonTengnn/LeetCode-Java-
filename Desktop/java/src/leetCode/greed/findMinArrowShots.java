package src.leetCode.greed;

import java.util.Arrays;
import java.util.Comparator;

public class findMinArrowShots {
    public int findMinArrowShots(int[][] points) {
        int ans =0;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] point1, int[] point2) {        // 用右边界排序
                if (point1[1] > point2[1]) {
                    return 1;
                } else if (point1[1] < point2[1]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        int end=points[0][1];
        for(int i=0;i<points.length;i++){
            int[] point=points[i];
            if(point[0]>end) {
                end=point[1];
                ans++;
            }
        }
        return ans+1;
    }
}
