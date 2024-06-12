package src.leetCode.backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class kthSmallest {
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix==null || matrix[0].length==0) return 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(k);

    }
}
