package src.testHKU;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class findRelation2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();   // 输入m个人
        ArrayList<String> guests = new ArrayList<>();   // 存放所有人的名字
        for (int i = 0; i < m; i++) {
            guests.add(in.next());
        }
        int k = in.nextInt() ;   // 输入k（查询是否有k个人互相认识）
        HashMap<String, HashSet<String>> relations = new HashMap<>();
        while(in.hasNext()){
            char[] chars = in.next().toCharArray();
            String[] names = getNames(chars);
            String person1 = names[0];
            String person2 = names[1];

            relations.computeIfAbsent(person1, key->new HashSet<String>()).add(person2);
            relations.computeIfAbsent(person2, key->new HashSet<String>()).add(person1);
        }
        System.out.println(isKPeopleKnowEachOther(guests, relations, k));
    }


    public static String[] getNames(char[] chars){
        String[] names = new String[2];
        boolean flag = true;
        for(int i=0;i<chars.length; i++){
            if(flag){   // 第一个名字，放到names[0]
                names[0]+=chars[i];
            }else{
                names[1] += chars[i];
            }
            if(chars[i] ==' '){
                flag = false;
            }

        }
        return names;
    }

    public static boolean isKPeopleKnowEachOther(ArrayList<String> guests, HashMap<String, HashSet<String>> relations, int k){
        for(String guest: guests){
            String peopleKnowEachOther = guest+relations.get(guest).toString();
            if(peopleKnowEachOther.length() == k ){
                return true;
            }
        }
        return false;
    }
}
