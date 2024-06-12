package src.leetCode.greed;

public class candy {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] candy=new int[n];
        candy[0]=1;
        for(int i=1;i<n;i++){   // 从前往后遍历，考虑右边
            if(ratings[i-1]<ratings[i])candy[i]=candy[i-1]+1;
            else candy[i]=1;
        }
        for(int i=n-2;i>0;i--){ // 从后往前遍历，考虑左边
            if(ratings[i]>ratings[i+1])candy[i]=Math.max(candy[i+1]+1,candy[i]); // 可能在第一次遍历时candy[i]已经是正确结果，防止覆盖
        }
        int sum=0;
        for(int num:candy){
            sum+=num;
        }
        return sum;
    }
}
