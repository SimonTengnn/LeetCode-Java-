package src.leetCode.Tree;

import javax.swing.*;
import java.util.ArrayList;

public class treeToString {
    public String tree2str(TreeNode root) {
        ArrayList<String> list  = new ArrayList<>();

        dfs(root,list);
        StringBuilder sb = new StringBuilder();
        for(String ch : list){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void dfs(TreeNode root,ArrayList<String> list) {
        if (root.left == null && root.right == null) {        // 没有孩子
            list.add(Integer.toString(root.val));
        }
        if (root.left != null && root.right != null) {// 两个孩子
            list.add(Integer.toString(root.val));   // 处理左边
            list.add("(");
            list.add(")");
            dfs(root.left, list);
            dfs(root.right, list);      // 处理右边
            list.add("(");
            list.add(")");
        }else if(root.left != null){        //只有左孩子
            list.add(Integer.toString(root.val));
            list.add("(");
            dfs(root.left, list);
        }else if( root.right != null){      //只有右孩子
            list.add(Integer.toString(root.val));
            list.add("(");
            list.add(")");
            dfs(root.right, list);
            list.add(")");
        }


        }
    }


