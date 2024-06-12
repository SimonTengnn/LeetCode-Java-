package src.leetCode;

public class isPalindrome {
    public boolean isPalindrome(String s) {
        if(s==null || s.length()==0 || s.length() == 1)return true;
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(Character.isLetterOrDigit(s.charAt(i)))i++;
            if(Character.isLetterOrDigit(s.charAt(j)))j--;
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))return false;
        }
        return true;
    }

}
