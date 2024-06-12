package src.testHKU;

import java.util.ArrayList;
import java.util.List;

public class devideNum {
    public static void devideNum(int N, List<Integer> ans){

        if(N == 0){
            for(int i=0;i<ans.size();i++){
                if(i<ans.size()-1){
                    System.out.print(ans.get(i)+" ");
                }
                if(i == ans.size() -1 )System.out.println(ans.get(i)+ " ");
            }

        }

        if(N>=1){
            ans.add(1);
            devideNum(N-1, ans);
            ans.remove(ans.size()-1);
        }
        if(N>=3){
            ans.add(3);
            devideNum(N-3,ans);
            ans.remove(ans.size()-1);
        }
    }

    public static void main(String[] args) {
        int N=4;
        List<Integer> ans = new ArrayList<>();
        devideNum(N,ans);

    }
}
