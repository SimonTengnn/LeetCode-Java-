package src.leetCode;

import java.util.HashSet;

public class test {

        public static void main(String[] args){
            int[] nums= {1,2,2,3,3,3,3,4,5,5,5,5,5,5,6,7,7,7,7,7,7};
            //    Arrays.sort(nums);
            HashSet<Integer> set =  new HashSet<>();

            for(int num:nums){
                if(!set.contains(num)){
                    set.add(num);
                }
                else{
                    set.remove(num);
                }
            }

            for(int num: set){
                System.out.print(" "+num);
            }

        }

}
