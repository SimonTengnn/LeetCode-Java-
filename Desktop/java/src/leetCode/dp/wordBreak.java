package src.leetCode.dp;

import java.util.List;

public class wordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=dp.length;i++){       // 排列，先背包
            for(int j=0;j<i;j++){        // 后物品
                String tmp = s.substring(j,i);
                if(wordDict.contains(tmp) && dp[j])dp[i]=true;
            }
        }
        return dp[s.length()];
    }
}
