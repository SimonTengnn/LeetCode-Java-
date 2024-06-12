package src.testHKU;

import java.util.Scanner;

public class findMin {
    // 返回数组中乘积最小的两个数

    public static void main(String[] args) {
        int[] arr = {-1,2,3,1,-2};
       int[] result=  findMin(arr);
        for (int i = 0; i < 2; i++) {
            System.out.print(result[i]+" ");
        }
    }

    public static int[] findMin(int[] arr){
        int[] result=new int[2];
        int tmp = arr[0]* arr[1];

        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1; j<arr.length;j++){
                if(arr[i] * arr[j] < tmp){
                    tmp = arr[i] * arr[j];
                    result[0]=arr[i];
                    result[1]=arr[j];
                }
            }
        }
        return result;
    }
}
