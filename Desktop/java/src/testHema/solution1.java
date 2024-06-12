package src.testHema;
import  java.io.*;
import java.util.*;

public class solution1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int time = in.nextInt();


        while (time-- > 0) {
            int arrayLen = in.nextInt();
            int[] nums = new int[arrayLen];
            int count=0;
            for(int i=0; i<arrayLen;i++){
                nums[i]=in.nextInt();
            }

            for(int i=0; i<arrayLen; i++){
                for(int j=0; j<arrayLen; j++){
                    if((nums[i]+nums[j]) == (nums[i] ^ nums[j])){
                        count ++;
                    }
                }
            }
            System.out.println(count);
        }
    }


}
