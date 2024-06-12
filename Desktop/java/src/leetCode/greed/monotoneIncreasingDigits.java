package src.leetCode.greed;

public class monotoneIncreasingDigits {
    public int monotoneIncreasingDigits(int n) {
        char[] num =Integer.toString(n).toCharArray();

        for(int i=num.length-1;i>0;i--){
            int start;
            if(num[i-1]>num[i]){
                start=i;
                num[i-1]-=1;                        // 把前一位-1，当前位变为9
                num[i]='9';
                for(int j=start+1;j<num.length;j++){      // 同时要把当前位后面的全都变成9
                    num[j]='9';
                }
            }

        }
        return Integer.valueOf(new String(num));
    }
}
