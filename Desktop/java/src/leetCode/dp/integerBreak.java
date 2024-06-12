package src.leetCode.dp;

public class integerBreak {
    public int integerBreak(int n) {
        if(n<2) return 0;
        if(n==2) return 1;
        int[] dp = new int[n+1];
        for(int i=2;i<dp.length;i++){
            int tmp=0;
            for(int j=2;j<i;j++){       // i固定时，寻找每个j可能对应的最大值，每次更新j时也更新最大值，j遍历完成以后再赋给dp[i]
                tmp=Math.max(tmp,Math.max(dp[i-j]*j,(i-j)*j));          //把i拆分成多个，就是dp[i-j]         把i拆分成两个，就是i-j
            }
            dp[i]=tmp;
        }
        return dp[n];
    }
}
