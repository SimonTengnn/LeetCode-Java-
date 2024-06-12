package src.leetCode.finalWord;

public class finalWord {
   public int lengthOfLastWord(String str){
    // 1. split
    //     String[] words = new String[str.length()];
    //     words=  str.split(" ");
    //    return words[str.length()-1].length();
       
       // 2. 从后向前遍历
       int count=0;
       boolean flag = false;        // 没到单词，空格后缀
       for (int i = str.length()-1; i >=0 ; i--) {
           if(str.charAt(i)==' ' && flag ){
               return count;
           }else if(str.charAt(i)!=' ') {
                flag = true;
           }else if(!flag){
               continue;
           }
           count++;

    }
       return count;
   }
}
