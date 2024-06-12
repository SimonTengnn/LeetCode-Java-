package src.testHKU;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class findFactorCount {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("in：");
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 2; i <= n; i++) {      // 放入 2~n
            list.add(i);
        }

        while (in.hasNext()){
            // ——————输入————————
            System.out.println("factor: ");
            int f = in.nextInt();
            // ——————操作——————
            removeElement(list,f);
            // ——————打印数组——————
           for(int num : list){
               System.out.print(num+" ");
           }
           if(f == 2) break;
        }

    }
    public static void removeElement(ArrayList<Integer> list, int f){
        List<Integer> toRemove = new ArrayList<>();

        for(int num: list){
            int count =countFactorTime(num,f);
            if(count % 2 ==1){
                toRemove.add(num);
            }
        }

        list.removeAll(toRemove);   // removeAll 能删除所有toRemove中包含的元素
    }

    public static int countFactorTime(int num, int f){
        int count=0;
        while(num%f==0){
            num /= f;
            count++;
        }
        return count;
    }
}
