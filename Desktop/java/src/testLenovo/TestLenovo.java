package src.testLenovo;
//编写程序进行2个版本对比，并返回结果：对比结果为1表示大于，0表示等于，-1表示小于。已知版本格式为xx.xx.xx.xx形式。
//例如：
//输入：1.04.3和1.030.2，输出：-1
//输入：12.3.5.2和10.2.3.4，输出：1
//输入：1.002.001和1.2.1，输出：0

import java.util.HashSet;
import java.util.Scanner;

public class TestLenovo {
   public static int compareVersion(String version1, String version2){
       String[] parts1 = version1.split("\\.");     // split参数是正则表达式，两个反斜杠代表不转义(一个反斜杠在正则表达式里也转义)
       String[] parts2 = version2.split("\\.");
   //    HashSet
       int len = Math.max(parts1.length, parts2.length);
       for (int i = 0; i < len; i++) {
           int v1Num = i<parts1.length? Integer.parseInt(parts1[i]):0;
           int v2Num = i<parts1.length? Integer.parseInt(parts2[i]):0;

           if(v1Num > v2Num){
               return 1;
           }else{
               return -1;
           }
       }
       return 0;
   }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String version1 = in.next();
        String version2 = in.next();
        System.out.println(compareVersion(version1, version2));
    }

}
