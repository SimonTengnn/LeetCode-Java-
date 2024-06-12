package src.leetCode.reverseStr;

public class reverseStr {
    public static void main(String[] args) {
        String str= "abcd";
        System.out.println(myReverse(str));
    }

    public static String myReverse(String str){

        char[] charArray = str.toCharArray();           // 先换成char数组才好操作

        for (int i = 0; i < str.length(); i++) {
            charArray[str.length()-i-1] = str.charAt(i);
        }
        return new String(charArray);
    }

}
