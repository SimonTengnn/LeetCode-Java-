package src.leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class findWinners {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> lose = new HashMap<>();
        for(int i=0;i<matches.length;i++){
            lose.putIfAbsent(matches[i][0],0);
            lose.put(matches[i][1],lose.getOrDefault(matches[i][1],0)+1);
        }

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> lose0 = new ArrayList<>();
        List<Integer> lose1 = new ArrayList<>();
        for(int id: lose.keySet()){
            if(lose.get(id) == 0) lose0.add(id);
            if(lose.get(id) == 1) lose1.add(id);
        }
        Collections.sort(lose0);
        Collections.sort(lose1);
        ans.add(lose0);
        ans.add(lose1);
        return ans;

    }
}
