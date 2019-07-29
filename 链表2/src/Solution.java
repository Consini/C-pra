import java.util.List;

/**
 * @ClassName Solution
 * @Description:
 * @Author:
 * @Date: 2019/7/27
 * @Time: 9:57
 * @Version 1.0
 **/
public class Solution {

//1.链表逆置
    public ListNode reserveList(ListNode head){
        ListNode result = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = result;
            result = cur;
            cur = next;
        }
        return result;
    }

//2.删除与给定 val 值相同的结点
    public ListNode removeElements(ListNode head,int val) {
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode p = head.next;
        while (p != null) {
            if (p.val == val) {
                prev.next = p.next;
            } else {
                prev = p;
            }
            p = p.next;
        }
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }

//3.合并两个有序链表
    public ListNode megerTwoLists(ListNode l1,ListNode l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode result = null;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode prev = null;
        while(p1 != null && p2 != null){
            if(p1.val <= p2.val){
                if(result == null){
                    result = p1;
                    prev = p1;
                }else{
                    prev.next = p1;
                    prev = p1;
                }
                p1 = p1.next;
            }else{
                if(result == null){
                    result = p2;
                    prev = p2;
                }else{
                    prev.next = p2;
                    prev = p2;
                }
                p2 = p2.next;
            }
        }
        if(p1 == null){
            prev.next = p2;
        }
        if(p2 == null){
            prev.next = p1;
        }
        return result;
    }

//4.按 x 分割链表
    public ListNode separateX(ListNode head,int x){
        ListNode small = null;
        ListNode large = null;
        ListNode smallLast = null;
        ListNode largeLast = null;
        while(head != null){
            if(head.val < x){
                if(small == null){
                    small = head;
                }else{
                    smallLast.next = head;
                }
                smallLast = head;
            }else{
                if(large == null){
                    large = head;
                }else{
                    largeLast.next = head;
                }
                largeLast = head;
            }
            head = head.next;
        }
        if(small == null){
            return large;
        }else{
            smallLast.next = large;
            if(large != null){
                largeLast.next = null;
            }
            return small;
        }
    }

//5.删除重复结点
//1->2->2->3->3->4       1->4
    public ListNode deleteDuplicated(ListNode head){
        if(head == null){
            return null;
        }
        ListNode tHead = new ListNode(-1);
        tHead.next = head;
        ListNode prev = tHead;
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p2 != null){
            if(p1.val != p2.val){
                prev.next = p1;
                prev = p1;
            }else{
                while(p2 != null && p2.val == p1.val){
                    p2 = p2.next;
                }
                prev.next = p2;
            }
            p1 = p2;
            if(p2 != null){
                p2 = p2.next;
            }
        }
        return tHead.next;
    }

//6.找到链表的中间结点
//获得链表长度
    public int getLinkLength(ListNode head){
    int len = 0;
    for(ListNode p = head;p != null;p = p.next){
        len++;
    }
    return len;
}
    public ListNode middleNode(ListNode head){
        int len = getLinkLength(head);
        ListNode p =head;
        for(int i = 0;i < len/2;i++){
            p = p.next;
        }
        return p;
    }

//7.找到链表的倒数第 k 个结点
    public ListNode findKthToTail(ListNode head,int k){
//         ListNode prev = head;
//        while (k != 0) {
//            k--;
//            prev = prev.next;
//            if (prev == null) {
//                if (k == 0) {
//                    return head;
//                } else {
//                    return null;
//                }
//            }
//        }
//        ListNode result = head;
//        while (prev != null) {
//            prev = prev.next;
//            result = result.next;
//        }
//        return result;
        int len = getLinkLength(head);
        int step = len - k;
        ListNode p = head;
        if(k > len || k < 0){
            System.out.println("k值不在合法范围内！");
            return null;
        }else if(k == len){
            return head;
        }else{
            for(int i = 0;i < step;i++){
                p = p.next;
            }
        }
        return p;
    }

//8.复杂链表的复制
    public Node copyRandom(Node head){
        if(head == null){
            return null;
        }
        //1.复制旧链表，并连接
        Node h = head;
        while(h != null){
            Node p = new Node(h.val,h.next,null);
            h.next = p;
            h = p.next;
        }
       //2.复制 random
        h = head;
        Node result = h.next;
        while(h != null){
            Node p = h.next;
            if(h.random != null){
                p.random = h.random.next;
            }
            h = p.next;
        }
       //3.还原链表
        h = head;
        while(h != null){
            Node p = h.next;
            h.next = p.next;
            if(p.next != null){
                p.next = p.next.next;
            }
            h = h.next;
        }
        return result;
    }

//9.旋转链表,给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
//输入: 1->2->3->4->5->NULL, k = 2
//输出: 4->5->1->2->3->NULL
    public ListNode rotateRight(ListNode head, int k){
        if(head == null || head.next == null){
            return head;
        }
        int len = getLinkLength(head);
        k = k%len;
        if(k == 0 ||  k == len){
            return head;
        }
        ListNode p = head;
        for(int i = 0;i < len - k - 1;i++){
            p = p.next;
        }
        ListNode last = head;
        while(last.next != null){
            last = last.next;
        }
        ListNode result = p.next;
        p.next = null;
        last.next = head;
        return result;
    }

}
