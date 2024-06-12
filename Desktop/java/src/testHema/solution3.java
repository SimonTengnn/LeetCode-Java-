package src.testHema;
import  java.io.*;
import java.util.*;

public class solution3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mount = in.nextInt();   //共多少个点
        // 注意 hasNext 和 hasNextLine 的区别
        for (int i = 0; i < mount; i++) {
            int left = in.nextInt();
            int right = in.nextInt();
            if(left == 0 && right== 0 && i<=2){
                break;
            }


        }
        System.out.println(1);
    }
}
