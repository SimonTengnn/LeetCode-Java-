package src;

import java.util.*;

public class reverse {
    public static void main(String[] args) {
          String s="the sky is blue";
        HashSet<Integer> set = new HashSet<>();
        Integer.valueOf(set.toString());
        set.
        String[] strs= s.split(" ");
        ArrayList<String> arrs = new ArrayList<>();
        String result = new String();
        for(String str: strs){
            arrs.add(str);
        }
        Collections.reverse(arrs);
        // result.join(" ",arrs);
        for(int i=0;i<arrs.size();i++){
            result+=arrs.get(i);
            if(i<arrs.size()-1) result+=" ";
        }
        System.out.println(result);


    }
}
