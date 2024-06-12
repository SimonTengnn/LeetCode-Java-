package src.leetCode.dp;

public class findMaxForm {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp= new int[strs.length+1][m+1][n+1];
        dp[0][0][0]=1;
        for(int i=1;i<=strs.length;i++){
            int zero_count =findZero(strs[i-1]);
            int one_count =findOne(strs[i-1]);
            for(int zero_max=0;zero_max<=m;zero_max++){
                for(int one_max=0;one_max<=n;one_max++){
                    if(zero_max<zero_count || one_max<one_count) dp[i][zero_max][one_max]=dp[i-1][zero_max][one_max]; // 不够放
                        else{
                            dp[i][zero_max][one_max]=Math.max(dp[i-1][zero_max][one_max],dp[i-1][zero_max-zero_count][one_max-one_count]+1);
                        }

                }
            }
        }

        return dp[strs.length][m][n];
    }

    public int findZero(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '0') count++;
        }
        return count;
    }
    public int findOne(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') count++;
        }
        return count;
    }
}
