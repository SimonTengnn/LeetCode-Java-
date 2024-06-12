package src.leetCode;

public class matrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int origin_r = mat.length;
        int origin_c = mat[0].length;

        if(r*c != origin_r * origin_c){ // 不满足，输出原矩阵
            return mat;
        }
        else{
            int[][] ans = new int[r][c];
            for (int i = 0; i < r * c; i++) {
                ans[i/c][i%c]=mat[i/origin_c][i%origin_c];
            }
            return ans;
        }
    }
}
