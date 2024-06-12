package src.leetCode;

import java.util.HashSet;

public class distributeCandies {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> types = new HashSet<>();
        for(int num : candyType){
            types.add(num);
        }
        return candyType.length/2 > types.size() ? types.size() : candyType.length/2;
    }
}
