/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/30 10:08
 **/
import java.util.*;
// 链式A+B
 class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
public class Plus {
    public static ListNode plusAB(ListNode a, ListNode b) {
        ListNode node = a;
        int sum1 = 0;
        int i = 1;
        while(node != null){
            sum1 = sum1 + i*node.val;
            i*=10;
            node = node.next;
        }
        node = b;
        int sum2 = 0;
        i = 1;
        while(node != null){
            sum2 = sum2+ i*node.val;
            i*=10;
            node = node.next;
        }
        int sum = sum1 + sum2;
        ListNode head = null;
        node = head;
        while(sum!= 0){
            ListNode tmp = new ListNode(sum%10);
            if(head == null){
                tmp.next = head;
                head = tmp;
            }else{
                tmp.next = node.next;
                node.next = tmp;
            }
            node = tmp;
            sum /= 10;
        }
        return head;
    }
    public static void print(ListNode a){
        ListNode node = a;
        while(node != null){
            System.out.print(node.val+" ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(1);
        a.next = a1;
        a1.next = a2;
        a2.next = null;
        print(a);
        ListNode b = new ListNode(9);
        ListNode b1 = new ListNode(8);
        ListNode b2 =  new ListNode(7);
        b.next = b1;
        b1.next = b2;
        b2.next = null;
        print(b);
        print(plusAB(a,b));
    }
}