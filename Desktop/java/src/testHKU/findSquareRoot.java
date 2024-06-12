package src.testHKU;

import java.util.Scanner;

public class findSquareRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s =  in.nextInt();
       int x0 = in.nextInt();

       int tolerance = in.nextInt();

        System.out.println(findSquareRoot(s,x0,tolerance));

    }

    public static int findSquareRoot(int s, int x0, int tolerance){
        int x1 = (x0 - s/x0)/2;

        while(Math.abs(x1-x0) >= tolerance){
            x0 = x1;
            x1 = (x1 - s/x1 )/2;
        }
        return x1;
    }
}
