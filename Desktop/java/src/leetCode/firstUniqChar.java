package src.leetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class firstUniqChar {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),-1);
            }
            else{
                map.put(s.charAt(i),i);
            }

        }
        if(map.isEmpty()) return -1;

        int min=s.length();
        for(char ch: map.keySet()){
            if(map.get(ch)<min && map.get(ch)!=-1)min=map.get(ch);
        }
        if(min==s.length()) return -1;
        return min;
    }
}
