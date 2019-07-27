/**
 * @ClassName Solution
 * @Description:
 * @Author:
 * @Date: 2019/7/27
 * @Time: 9:57
 * @Version 1.0
 **/
public class Solution {
    //以 x 分割链表
    //3  2  5  1  6   x = 5 ---->  p 3  2  1  q 5  6
    public ListNode separateX(ListNode head,int x){
        ListNode p = null;
        ListNode q = null;
        ListNode pLast = null;
        ListNode qLast = null;
        while(head != null){
            if(head.val < x){
                if(p == null){
                    p = head;
                }else{
                    pLast.next = head;
                }
                pLast = head;
            }else{
                if(q == null){
                    q = head;
                }else{
                    qLast.next = head;
                }
                qLast = head;
            }
            head = head.next;
        }
        if(p == null){
            return q;
        }else{
            pLast.next = q;
            if(q != null){
                qLast.next = null;
            }
            return p;
        }
    }

    //删除重复结点
    //1->2->2->3->3->4       1->4
    public ListNode deleteDuplicated(ListNode head){
        if(head == null){
            return null;
        }
        ListNode prev = null;
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p2 != null){
            if(p1.val != p2.val){
                prev = p1;
            }else{
                while(p2 != null && p2.val == p1.val){
                    p2 = p2.next;
                }
                if(prev == head){
                    head = p2;
                }else{
                    prev.next = p2;
                }
            }
            p1 = p2;
            if(p2 != null){
                p2 = p2.next;
            }
        }
        return head;
    }

    //拷贝旧链表，创建新链表
    public ListNode copyList(ListNode head){
        ListNode h = head;
        ListNode result = null;
        ListNode last = null;
        while(h != null){
            //ListNode node = new ListNode(h.val);
            ListNode node = new ListNode();
            node.val = h.val;
            if(result == null){
                result = node;
            }else{
                last.next = node;
            }
            last = node;
            h = h.next;
        }
        return result;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        return null;
    }
}
