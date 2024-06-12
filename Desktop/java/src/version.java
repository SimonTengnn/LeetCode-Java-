package src;

import java.util.ArrayList;
import java.util.Arrays;

public class version {
    public static void main(String[] args) {
        String str1 = "  Release-1.3";
        String str2= "  Release-3.3";
        String str3 = "  Release-12.05";
        String str4 = "  Release-12.3";
        int len=4;
        int[] max_1 = new int[len];
        String[] res_1=str1.split("-");
        String[] res_2=str2.split("-");
        String[] res_3=str3.split("-");
        String[] res_4=str4.split("-");

        String[] num_1= res_1[1].split("\\.");
        String[] num_2= res_2[1].split("\\.");
        String[] num_3= res_3[1].split("\\.");
        String[] num_4= res_4[1].split("\\.");
        ArrayList<String> nums_v1 = new ArrayList<>();
        nums_v1.add(num_1[0]);
        //nums.add(num_2);
        //nums.add(num_1);
        // nums.add(num_1);
        int max = Integer.valueOf(num_1[0]);
        for(int i=0;i<len;i++ ){

        }

    }
}
