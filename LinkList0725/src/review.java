/**
 * @ClassName review
 * @Description:
 * @Author:
 * @Date: 2019/7/26
 * @Time: 21:02
 * @Version 1.0
 **/
class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this(val, null);
    }
}
public class review {

    /*
    删除链表中重复的结点
    题目描述：在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，
    链表1->2->3->3->4->4->5
    处理后为 1->2->5   */
    public  ListNode deleteDuplication(ListNode pHead){
        if(pHead == null){
            return null;
        }
       ListNode prev = null;
       ListNode p1 = pHead;
       ListNode p2 = pHead.next;
       while(p2 != null){
           if(p1.val != p2.val){
               prev = p1;
               p1 = p2;
               p2 = p2.next;
           }else{
               while(p2 != null && p2.val == p1.val){
                   p2 = p2.next;
               }
               if(prev == null){
                   pHead = p2;
               }else{
                   prev.next = p2;
               }
               p1 = p2;
               if(p2 != null){
                   p2 = p2.next;
               }
           }
       }
       return pHead;
    }

    /*链表中倒数第k个结点 
     题目描述：输入一个链表，输出该链表中倒数第k个结点。*/

    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode prev = head;
        while(k != 0){
            if(prev == null){
                return null;
            }
            prev = prev.next;
            k--;
        }
        ListNode cur = head;
        while(prev != null){
            prev = prev.next;
            cur = cur.next;
        }
        return cur;
    }

    /*链表分割
题目描述：编写代码，以给定值x为基准将链表分割成两部分，
所有小于x的结点排在大于或等于x的结点之前给定一个链表的头指针 ListNode* pHead，
请返回重新排列后的链表的头指针。注意：分割以后保持原来的数据顺序不变。*/
    public ListNode partition(ListNode pHead, int x){
        ListNode p = null;
        ListNode q = null;
        ListNode pl = null;
        ListNode ql = null;
        ListNode cur = pHead;
        while(cur != null){
            if(cur.val < x){
                if(p == null){
                    p = cur;
                }else{
                    pl.next = cur;
                }
                pl = cur;
            }else{
                if(q == null){
                    q = cur;
                }else{
                    ql.next = cur;
                }
                ql = cur;
            }
            cur = cur.next;
        }
        if(p == null){
            return q;
        }else{
            pl.next = q;
            if(q != null){
                ql.next = null;
            }
            return p;
        }
    }

    /*链表的中间结点：
  题目描述：给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
  如果有两个中间结点，则返回第二个中间结点。*/
    public ListNode middleNode(ListNode head){
        if(head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null){
            if(fast.next == null){
                break;
            }
            fast = fast.next;
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    private static ListNode createTestList() {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(6);
        ListNode n5 = new ListNode(2);
        ListNode n6 = new ListNode(5);
        ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;

        return n1;
    }

    private static void test1() {
        ListNode head = createTestList();
        ListNode result = new review().deleteDuplication(head);
        print(result);
    }

    private static void test2() {
        ListNode head = createTestList();
        ListNode result = new review().FindKthToTail(head,5);
        print(result);
    }

    private static void test3() {
        ListNode head = createTestList();
        ListNode result = new review().partition(head,5);
        print(result);
    }
    private static void test4() {
        ListNode head = createTestList();
        ListNode result = new review().middleNode(head);
        print(result);
    }
    private static void print(ListNode head){
        for (ListNode cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.val+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //test1();
        test2();
        test3();
        test4();
    }
}
