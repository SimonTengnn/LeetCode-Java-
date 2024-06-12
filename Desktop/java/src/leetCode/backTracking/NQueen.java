package src.leetCode.backTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] chess = new char[n][n];
        // 初始化棋盘
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = '.';
            }
        }

        backTracking(n,0,chess,ans);

        return ans;
    }

    public void backTracking(int n ,int count,char[][] chess,List<List<String>> ans){
        if(count==n){
            List<String> tmp = new ArrayList<>();       // 每一行是一个string，一个棋盘存在一个tmp中，每次有解都会新建tmp
           for(char[] chars:chess){
               tmp.add(new String(chars));
           }
           ans.add(tmp);
        }
        for(int i=0;i<n;i++){
            if(isValid(count,i,chess,n)){
                chess[count][i]='Q';
                backTracking(n,count+1,chess,ans);
                chess[count][i]='.';
            }
        }
    }
    public boolean isValid(int row,int col,char[][] chess,int n){
        // 检查列是否有皇后
        for (int i = 0; i < row; i++) {
            if (chess[i][col] == 'Q') {
                return false;
            }
        }

        // 检查左上对角线是否有皇后
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }

        // 检查右上对角线是否有皇后
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
}
