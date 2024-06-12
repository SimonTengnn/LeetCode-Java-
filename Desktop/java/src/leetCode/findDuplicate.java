package src.leetCode;

import java.lang.reflect.Array;
import java.util.*;

public class findDuplicate {
    public List <List< String >> findDuplicate(String[] paths) {
        Map<String, List< String >> map = new HashMap<>();
        for (String path : paths) {
            String[] s = path.split(" ");           // s[0]是地址   s[1]~s[n]是文件(内容)
            for (int i = 1; i < s.length; i++) {
                String[] value = s[i].split("\\(");     //value[0]是文件名  value[1]是内容）
                value[1] = value[1].replace(")", "");       // 把文件内容的)用replace清空
                map.computeIfAbsent(value[1],key->new ArrayList<>()).add(s[0]+"/"+value[0]);
            }
        }

        List<List<String>> res = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key).size() > 1){
                res.add(map.get(key));
            }
        }
        return res;
    }

}
