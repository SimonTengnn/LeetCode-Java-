package src.leetCode.gasStation;

public class gasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            if (sum < min) {
                min = sum;        // 记录最少的地方
            }
        }
        if (sum < 0) return -1;  // 总油数<总开销，肯定跑不完一圈
        if (min >= 0) return 0; // 从开始就没断过
      //  for(int i=)
        return sum;
    }
}
