package src.testShopee;

public class solution1 {
    public int isduplicated(String given_strings) {
        if(given_strings.length()>26){
            return 1;
        }
       int flag=0;

        char[] time = new char[26];
        for (int i = 0; i < given_strings.length(); i++) {
            time[(given_strings.charAt(i)-'a')] ++;
        }
        for (int i = 0; i < 26; i++) {
            if(time[i]>=2){
                flag=1;
                break;
            }
        }
        return flag;
    }
}
