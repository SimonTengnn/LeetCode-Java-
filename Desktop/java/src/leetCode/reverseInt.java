package src.leetCode;

import java.util.Arrays;

public class reverseInt {
    public static void main(String[] args) {

    }

    public int reverse(int x) {
        char[] nums = Integer.toString(x).toCharArray();
        char[] result = new char[nums.length];
        int index_result = 0;
        boolean flag = false;
        if(x<0) {
            result[0]='-';
            index_result=0;
        }
        for (int i = nums.length - 1; i > 0; i--) {
            if (!flag && nums[i] == 0) {        // 后缀的0要舍弃
            } else {
                flag = true;
                result[index_result++] = nums[i];
            }
        }
        return Integer.valueOf(new String(result));
    }
}
