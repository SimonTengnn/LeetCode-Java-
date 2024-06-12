package src.leetCode.Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class postOrderinX {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();

        dfs(root,list);
        return list;
    }

    public static void dfs(Node root, ArrayList<Integer> list){
        if(root == null ){
            return;
        }

        for(Node child : root.children){
            dfs(child,list);
        }
        list.add(root.val);
    }
}
