package src.leetCode.greed;

import java.util.HashMap;

public class lemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> change = new HashMap<>();
        change.put(5,0);
        change.put(10,0);
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5)change.put(5,change.get(5)+1);
            if(bills[i]==10){
                if(change.get(5)==0){
                    return false;
                }
                else{
                    change.put(5, change.get(5)-1);
                    change.put(10, change.get(10)+1);
                }
            }
            if(bills[i]==20){
                if(change.get(10)>=1 && change.get(5)>=1){
                    change.put(5, change.get(5)-1);
                    change.put(10, change.get(10)-1);
                }
                else if(change.get(5)>=3){
                    change.put(5, change.get(5)-3);
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
