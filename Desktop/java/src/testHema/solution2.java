package src.testHema;
import  java.io.*;
import java.util.*;

public class solution2 {
    static int count =0;
    static int start = 2;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int mount=0;
        for (int i = 0; i < len; i++) {
             int num = in.nextInt();
                if(find(num)){
                    mount++;
                }
            System.out.println("start:"+start+",  count:"+count);
        }
        System.out.println(mount);
    }
    public static boolean find(int num){


        for(int i=start; i<num; i++){
            if(num % i == 0 ) {
                count++;
                System.out.println(count);
                num /= i;
                start=i;
            }
            if(count >=3 ){
                count=0;
                start =2;
                return true;
            }
            count=0;
            start = 2;
            find(num);
        }

       return false;
    }
}
