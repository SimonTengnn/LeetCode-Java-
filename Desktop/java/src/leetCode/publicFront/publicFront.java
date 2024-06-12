package src.leetCode.publicFront;

public class publicFront {
    public static void main(String[] args) {

    }

    public static String findFront(String[] strs){
        if(strs==null || strs.length==0){
            return "";
        }

        String front = strs[0];

        for (int i = 0; i < strs.length; i++) {
            while(strs[i].indexOf(front) != 0){             // 只要没有匹配就减少
                front.substring(0, front.length() -1 );
                if(front.isEmpty()){
                    return "";
                }
            }
        }
        return front;
    }

}
