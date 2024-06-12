package src.leetCode;

import java.security.Key;
import java.util.HashMap;

public class canConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
            }
        }
        for(char ch:map.keySet()){
            int time=map.get(ch);
            if(time>=0) return false;
        }
        return true;
    }
}
