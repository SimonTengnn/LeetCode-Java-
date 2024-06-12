package src.leetCode;

import java.util.*;

public class findRestaurant {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min =Integer.MAX_VALUE;
        List<String> ans = new ArrayList<>();
        HashMap<String ,Integer> map = new HashMap<>();     // 在遍历list2的时候要得到指定string在list1中的index，那就用一个map来存<String,Integer>
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);                //    向map中放，使用put
        }

        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){  //如果有相同
                int index1= map.get(list2[i]);
                if(index1+i<=min){
                    if(index1+i != min){
                        ans.clear();        // 如果有索引更小的，要清空原来的答案
                        min=index1+i;
                    }
                    ans.add(list2[i]);
                }
            }
        }
        return  ans.toArray(new String[ans.size()]);    // ans是list，把list转换成数组
    }
}
