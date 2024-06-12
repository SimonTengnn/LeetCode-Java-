package src.testHKU;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class findRelation {
    public static void main(String[] args) {

        // ————————————输入部分——————————
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        ArrayList<String> guests = new ArrayList<>();
        for (int i = 0; i < m; i++) {       // m行，输入所有人的名字
            guests.add(in.next());
        }
        int k = in.nextInt();       // 问题：是否有k人相互认识


        // ——————————————处理部分——————————————
        HashMap<String , HashSet<String>> relations = new HashMap<>();
        for (int i = 0; i < k; i++) {
            String relation = in.next();            // 每行输入两个人，空格隔开:  a b
            String person1 = ""+relation.charAt(0);
            String person2 = ""+relation.charAt(2);

            relations.computeIfAbsent(person1, key->new HashSet<>()).add(person2); // HashMap内置函数 1.如果没有person1，新建他的value(hashset)，返回这个hashset向其中插入person2
            relations.computeIfAbsent(person2, key->new HashSet<>()).add(person1); // 2.如果已经有过person1，直接返回他的value，向这个返回的hashset插入person2
        }
        int[] time = new int[10];
        //new String(time);

        System.out.println(findResult(guests, relations, k));
    }

    public static String findResult( ArrayList<String> guests, HashMap<String, HashSet<String>>relations,int k) {
        String result="";
        String Yes =" know each other";
        String No = " do not know each other";
        boolean flag=false;

        for (int i = 0; i < guests.size(); i++) {
            String guest = guests.get(i);
            String eachother = guest+relations.get(guest).toString();
            if(eachother.length() == k){
                result = eachother;
                flag=true;
                break;
            }else{
                result = eachother;
            }

        }
        if(flag){
            return result+Yes;
        }else{
            return result+No;
        }
    }
}
