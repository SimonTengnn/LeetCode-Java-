package src.testHKU;

import java.util.ResourceBundle;
import java.util.Scanner;

public class findNum {


        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=sc.nextInt();
        int count=0;
        int num=2;
        int result;


        while (true){
            if(isPrime(num++)){
                count++;
            }
            if(num==max){
                result = count;
                break;
            }
        }
        System.out.println(result);

    }
}
