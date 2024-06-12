package src.testHKU;

import java.lang.invoke.CallSite;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class getBall {

    public static void findBall(int N, List<Integer> list){
        if(N == 0){
            for (int i = 0; i < list.size(); i++) {
                if(i!=list.size() -1 )System.out.print(list.get(i)+" ");        // .get得到元素值
                else System.out.println(list.get(i));
            }
        }

        if(N >= 1){
            list.add(1);                    // 表示本次拿1个球
            findBall(N-1, list);        // 还剩下N-1个球
            list.remove(list.size() -1 );   //  回溯，  从下一层递归中回来，要把下一层递归取的球再放回
                                                    // 不需要对N进行操作，返回上层递归的时候N会回到该层调用时传入的N（每一层递归的时候N都不一样）
        }
        if(N>=2){
            list.add(2);
            findBall(N-2, list);
            list.remove(list.size() -1);
        }
        if(N>=3){
            list.add(3);
            findBall(N-3, list);
            list.remove(list.size() -1);
        }
    }

    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
      int N= in.nextInt();
     List<Integer> list = new ArrayList<>();
     findBall(N,list);
    }

}
