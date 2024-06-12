package src.leetCode.dp;

public class fib {
    public static  int fib(int n) {
    /*
      // 递推
      if(n<=1) return n;
        int[] dp = new int[2];
        dp[1]=1;
        for(int i=2;i<n;i++){
            int sum = dp[0]+dp[1];
            dp[0]=dp[1];
            dp[1]=sum;
        }
        return dp[1];
    }
    */
        // 递归
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
