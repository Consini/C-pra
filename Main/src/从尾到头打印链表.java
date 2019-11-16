import java.util.ArrayList;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/14 17:42
 **/

     class ListNode {
        int val;
         ListNode next = null;

         ListNode(int val) {
             this.val = val;
         }
     }

public class 从尾到头打印链表 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode node = listNode;
        int length = 0;
        while(node != null){
            length++;
            node = node.next;
        }
        node = listNode;
        ArrayList<Integer> list = new ArrayList<>(length);
        for(int i = length - 1;i>=0;i--){
            list.add(i,node.val);
            node = node.next;
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
