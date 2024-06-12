package src.leetCode.greed;

public class canCompleteCircuit {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0;
        for(int i=0;i<gas.length;i++){
            sum+=gas[i]-cost[i];
            if(sum<=0){
                sum=0;
                continue;
            }
            for(int j=i;j<=i+gas.length;j++){
                if(j== i+gas.length) return i;
                sum+=gas[j%gas.length]-cost[j%gas.length];
            }
        }
        return -1;
    }
}
