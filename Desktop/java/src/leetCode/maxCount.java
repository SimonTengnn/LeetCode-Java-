package src.leetCode;

public class maxCount {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0){
            return 1;
        }
        int minRow = Integer.MAX_VALUE;
        int minColumn = Integer.MAX_VALUE;
        for(int i=0;i<ops.length;i++){
            minRow = Math.min(minRow,ops[i][0]);
            minColumn = Math.min(minColumn,ops[i][1]);
        }
        return minRow*minColumn;
    }
}
