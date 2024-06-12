package src.testShopee;

import java.lang.reflect.Array;
import java.util.ArrayList;

 class ListNode {
    int val;
   ListNode next = null;
    public ListNode(int val) {
      this.val = val;
    }
  }

public class solution3 {
    public ListNode Rotate(ListNode head, int k) {
        // write code here
        if(head == null){       // 长度0
            return null;
        }
        if(head.next == null){            // 长度1
            return head;
        }

        int len=1;
        ArrayList<Integer> origin = new ArrayList<>();
        origin.add(head.val);
        ListNode p =head.next;
        while(p != null){
            len++;          // 链表总长度
            origin.add(p.val);          // origin存放原链表
            p=p.next;
        }
        int[] result = new int[origin.size()];      // 存入，head到了最后

        for(int i =0;i<origin.size();i++){          // result存放移动后的val序列
            result[(i+k)%len]=origin.get(i);
        }
        head.val=result[0];

        ListNode q=head.next;
        for(int i=1;i<origin.size();i++){
            q.val=result[i];
            q=q.next;
        }
        return head;
    }
}
